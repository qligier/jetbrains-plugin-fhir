// This is a generated file. Not intended for manual editing.
package ch.qligier.jetbrains.plugin.fhir.fsh.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ch.qligier.jetbrains.plugin.fhir.fsh.parser.psi.FshTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ch.qligier.jetbrains.plugin.fhir.fsh.parser.psi.*;
import ch.qligier.jetbrains.plugin.fhir.fsh.specification.MetadataType;

public class FshMetadataImpl extends ASTWrapperPsiElement implements FshMetadata {

  public FshMetadataImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FshVisitor visitor) {
    visitor.visitMetadata(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FshVisitor) accept((FshVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FshMetadata getMetadata() {
    return findNotNullChildByClass(FshMetadata.class);
  }

  @Override
  public @Nullable PsiElement getValueElement() {
    return FshPsiImplUtil.getValueElement(this);
  }

  @Override
  public MetadataType getMetadataType() {
    return FshPsiImplUtil.getMetadataType(this);
  }

}
