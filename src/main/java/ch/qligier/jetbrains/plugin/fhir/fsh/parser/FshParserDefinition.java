// Copyright 2024 Quentin Ligier. Use of this source code is governed by the MIT license.

package ch.qligier.jetbrains.plugin.fhir.fsh.parser;

import ch.qligier.jetbrains.plugin.fhir.fsh.FshLanguage;
import ch.qligier.jetbrains.plugin.fhir.fsh.FshUtils;
import ch.qligier.jetbrains.plugin.fhir.fsh.grammar.FshLexer;
import ch.qligier.jetbrains.plugin.fhir.fsh.grammar.FshParser;
import ch.qligier.jetbrains.plugin.fhir.fsh.psi.DebugPsiNode;
import ch.qligier.jetbrains.plugin.fhir.fsh.psi.FshPsiDocument;
import ch.qligier.jetbrains.plugin.fhir.fsh.psi.FshPsiFile;
import ch.qligier.jetbrains.plugin.fhir.fsh.psi.FshPsiName;
import ch.qligier.jetbrains.plugin.fhir.fsh.psi.entity.FshPsiAlias;
import ch.qligier.jetbrains.plugin.fhir.fsh.psi.entity.FshPsiProfile;
import com.intellij.lang.ASTFactory;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jspecify.annotations.Nullable;


/**
 * jetbrains-plugin-fhir
 *
 * @author Quentin Ligier
 **/
public class FshParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE =
            new IFileElementType(FshLanguage.INSTANCE);
    public static final TokenSet COMMENTS;
    public static final TokenSet WHITESPACE;
    public static final TokenSet STRING;

    static {
        COMMENTS = PSIElementTypeFactory.createTokenSet(
                FshLanguage.INSTANCE,
                FshLexer.LINE_COMMENT,
                FshLexer.BLOCK_COMMENT);
        WHITESPACE = PSIElementTypeFactory.createTokenSet(
                FshLanguage.INSTANCE,
                FshLexer.WHITESPACE);
        STRING = PSIElementTypeFactory.createTokenSet(
                FshLanguage.INSTANCE,
                FshLexer.STRING,
                FshLexer.MULTILINE_STRING);
    }

    /**
     * Returns the lexer for lexing files in the specified project. This lexer does not need to support incremental
     * relexing - it is always called for the entire file.
     *
     * @param project the project to which the lexer is connected.
     * @return the lexer instance.
     */
    @Override
    public Lexer createLexer(final Project project) {
        return FshUtils.createLexer();
    }

    /**
     * Returns the parser for parsing files in the specified project.
     *
     * @param project the project to which the parser is connected.
     * @return the parser instance.
     */
    @Override
    public PsiParser createParser(final Project project) {
        return FshUtils.createParser();
    }

    /**
     * Returns the element type of the node describing a file in the specified language.
     *
     * @return the file node element type.
     */
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    /**
     * Returns the set of token types which are treated as comments by the PSI builder. Tokens of those types are
     * automatically skipped by PsiBuilder. Also, To Do patterns are searched in the text of tokens of those types. For
     * composite comment elements it should contain only the root element type (for example
     * {@link com.intellij.psi.impl.source.tree.JavaDocElementType#DOC_COMMENT}).
     *
     * @return the set of comment token types.
     */
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    /**
     * Returns the set of element types which are treated as string literals. "Search in strings" option in refactorings
     * is applied to the contents of such tokens.
     *
     * @return the set of string literal element types.
     */
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING;
    }

    /**
     * Creates a PSI element for the specified AST node. The AST tree is a simple, semantic-free tree of AST nodes which
     * is built during the PsiBuilder parsing pass. The PSI tree is built over the AST tree and includes elements of
     * different types for different language constructs.
     * <p>
     * !!!WARNING!!! PSI element types should be unambiguously determined by AST node element types. You should not
     * produce different PSI elements from AST nodes of the same types (e.g. based on AST node content). Typically, your
     * code should be as simple as that:
     * <pre>{@code
     *   if (node.getElementType == MY_ELEMENT_TYPE) {
     *     return new MyPsiElement(node);
     *   }
     * }</pre>
     *
     * @param node the node for which the PSI element should be returned.
     * @return the PSI element matching the element type of the AST node.
     */
    @Override
    public PsiElement createElement(final ASTNode node) {
        final IElementType elType = node.getElementType();
        System.out.println("Creating PSI node for element type " + elType);
        if (elType instanceof TokenIElementType) {
            return new DebugPsiNode(node, "token");
        }
        if (!(elType instanceof final RuleIElementType ruleElType)) {
            return new DebugPsiNode(node, "notRule");
        }
        return switch (ruleElType.getRuleIndex()) {
            case FshParser.RULE_doc -> new FshPsiDocument(node);
            case FshParser.RULE_alias -> new FshPsiAlias(node);
            case FshParser.RULE_profile -> new FshPsiProfile(node);
            case FshParser.RULE_entity -> this.createEntityElement(node);
            case FshParser.RULE_name -> new FshPsiName(node);
            default -> new DebugPsiNode(node, "default");
        };
    }

    public PsiElement createEntityElement(final ASTNode node) {
        final var firstChild = node.getFirstChildNode();
        if (firstChild == null) {
            throw new RuntimeException();
        }
        final var elType = firstChild.getElementType();
        if (!(elType instanceof final RuleIElementType ruleElType)) {
            throw new RuntimeException();
        }
        switch (ruleElType.getRuleIndex()) {
            case FshParser.RULE_profile:
                return new DebugPsiNode(node, "profile");
        }
        return new DebugPsiNode(node, "defaultEntity");
    }


    /**
     * Creates a PSI element for the specified virtual file.
     *
     * @param viewProvider virtual file.
     * @return the PSI file element.
     */
    @Override
    public PsiFile createFile(final FileViewProvider viewProvider) {
        return new FshPsiFile(viewProvider);
    }

    /**
     * Returns the set of token types which are treated as whitespace by the PSI builder. Tokens of those types are
     * automatically skipped by PsiBuilder. Whitespace elements on the bounds of nodes built by PsiBuilder are
     * automatically excluded from the text range of the nodes.
     * <p><strong>It is strongly advised you return TokenSet that only contains
     * {@link TokenType#WHITE_SPACE}, which is suitable for all the languages unless you really need to use special
     * whitespace token</strong>
     *
     * @return the set of whitespace token types.
     */
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    /**
     * Checks if the specified two token types need to be separated by a space according to the language grammar. For
     * example, in Java two keywords are always separated by a space; a keyword and an opening parenthesis may be
     * separated or not separated. This is used for automatic whitespace insertion during AST modification operations.
     *
     * @param left  the first token to check.
     * @param right the second token to check.
     * @return the spacing requirements.
     */
    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return SpaceRequirements.MAY;
    }

    /**
     * @param originalSpaceNode
     * @param newWhiteSpaceSequence
     * @return new node for the white space iff {@code originalSpaceNode} can be replaced with new one with text from
     * {@code newWhiteSpaceSequence} for the language or null.
     * @apiNote {@code newWhiteSpaceSequence} is guaranteed to contain only {@link Character#isWhitespace spaces}.
     * Parser definition is selected by platform using language from parent element of the whitespace. Keep in mind that
     * original space may not only be part of your language file, but in multi-psi file as a part of the templating
     * file, part of the file injected into other element, part of lazy-parseable element in other language, part of
     * derived language. Some of these cases may require additional logic.
     * @see ASTFactory#leaf(IElementType, CharSequence)
     */
    @Override
    public @Nullable ASTNode reparseSpace(final ASTNode originalSpaceNode,
                                          final CharSequence newWhiteSpaceSequence) {
        return ParserDefinition.super.reparseSpace(originalSpaceNode, newWhiteSpaceSequence);
    }
}
