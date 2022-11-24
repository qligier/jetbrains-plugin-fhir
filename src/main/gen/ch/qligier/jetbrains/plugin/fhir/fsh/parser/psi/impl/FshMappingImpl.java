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

public class FshMappingImpl extends ASTWrapperPsiElement implements FshMapping {

  public FshMappingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FshVisitor visitor) {
    visitor.visitMapping(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FshVisitor) accept((FshVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FshMappingEntityRule> getMappingEntityRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshMappingEntityRule.class);
  }

  @Override
  @NotNull
  public List<FshMappingMetadata> getMappingMetadataList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshMappingMetadata.class);
  }

}