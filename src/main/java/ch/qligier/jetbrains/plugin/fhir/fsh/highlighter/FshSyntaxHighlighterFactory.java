// Copyright 2022 Quentin Ligier. Use of this source code is governed by the MIT license.

package ch.qligier.jetbrains.plugin.fhir.fsh.highlighter;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The factory of syntax highlighter. Nothing fancy here :)
 *
 * @author Quentin Ligier
 **/
public class FshSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    /**
     * Override this method to provide syntax highlighting (coloring) capabilities for your language implementation. By
     * syntax highlighting we mean highlighting of keywords, comments, braces etc. where lexing the file content is
     * enough to identify proper highlighting attributes.
     *
     * @param project     might be necessary to gather various project settings from.
     * @param virtualFile might be necessary to collect file specific settings
     * @return {@code SyntaxHighlighter} interface implementation for this particular language.
     */
    @Override
    public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable final Project project,
                                                           @Nullable final VirtualFile virtualFile) {
        return new FshSyntaxHighlighter();
    }
}
