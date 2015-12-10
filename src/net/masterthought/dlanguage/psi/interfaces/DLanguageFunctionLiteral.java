// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageFunctionLiteral extends PsiElement {

  @Nullable
  DLanguageFunctionLiteralBody getFunctionLiteralBody();

  @Nullable
  DLanguageLambda getLambda();

  @Nullable
  DLanguageParameterAttributes getParameterAttributes();

  @Nullable
  DLanguageParameterMemberAttributes getParameterMemberAttributes();

  @Nullable
  DLanguageType getType();

  @Nullable
  PsiElement getKwDelegate();

  @Nullable
  PsiElement getKwFunction();

}