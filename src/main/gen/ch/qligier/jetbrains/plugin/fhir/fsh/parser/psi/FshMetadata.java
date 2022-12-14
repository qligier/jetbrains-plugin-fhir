// This is a generated file. Not intended for manual editing.
package ch.qligier.jetbrains.plugin.fhir.fsh.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import ch.qligier.jetbrains.plugin.fhir.fsh.specification.MetadataType;

public interface FshMetadata extends PsiElement {

  @NotNull
  FshMetadata getMetadata();

  @Nullable PsiElement getValueElement();

  MetadataType getMetadataType();

}
