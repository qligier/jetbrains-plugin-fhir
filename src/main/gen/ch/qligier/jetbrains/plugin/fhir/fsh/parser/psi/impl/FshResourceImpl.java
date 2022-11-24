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

public class FshResourceImpl extends ASTWrapperPsiElement implements FshResource {

  public FshResourceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FshVisitor visitor) {
    visitor.visitResource(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FshVisitor) accept((FshVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FshDescription> getDescriptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshDescription.class);
  }

  @Override
  @NotNull
  public List<FshId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshId.class);
  }

  @Override
  @NotNull
  public List<FshLrRule> getLrRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshLrRule.class);
  }

  @Override
  @NotNull
  public List<FshParent> getParentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshParent.class);
  }

  @Override
  @NotNull
  public List<FshTitle> getTitleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FshTitle.class);
  }

}