// Copyright 2022 Quentin Ligier. Use of this source code is governed by the MIT license.

package ch.qligier.jetbrains.plugin.fhir.fsh;

import ch.qligier.jetbrains.plugin.fhir.fsh.parser.psi.FshTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Defines the brace matching support required for the FSH language.
 *
 * @author Quentin Ligier
 * @see <a href="https://plugins.jetbrains.com/docs/intellij/additional-minor-features.html#brace-matching">Brace
 * Matching</a>
 **/
public class FshPairedBraceMatcher implements PairedBraceMatcher {

    private static final BracePair[] PAIRS = new BracePair[]{
            new BracePair(FshTypes.LEFTPAREN,
                          FshTypes.RIGHTPAREN,
                          false),
            new BracePair(FshTypes.LEFTBRACKET,
                          FshTypes.RIGHTBRACKET,
                          false),
    };

    /**
     * Returns the array of definitions for brace pairs that need to be matched when editing code in the language.
     *
     * @return the array of brace pair definitions.
     */
    @Override
    public BracePair @NotNull [] getPairs() {
        return PAIRS;
    }

    /**
     * Returns {@code true} if paired rbrace should be inserted after lbrace of given type when lbrace is encountered
     * before contextType token. It is safe to always return {@code true}, then paired brace will be inserted anyway.
     *
     * @param lbraceType  lbrace for which information is queried
     * @param contextType token type that follows lbrace
     * @return true / false as described
     */
    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull final IElementType lbraceType,
                                                   @Nullable final IElementType contextType) {
        return true;
    }

    /**
     * Returns the start offset of the code construct which owns the opening structural brace at the specified offset.
     * For example, if the opening brace belongs to an 'if' statement, returns the start offset of the 'if' statement.
     *
     * @param file               the file in which brace matching is performed.
     * @param openingBraceOffset the offset of an opening structural brace.
     * @return the offset of corresponding code construct, or the same offset if not defined.
     */
    @Override
    public int getCodeConstructStart(final PsiFile file, final int openingBraceOffset) {
        return 0;
    }
}
