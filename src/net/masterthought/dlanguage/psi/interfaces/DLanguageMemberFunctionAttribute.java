// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageMemberFunctionAttribute extends PsiElement {

  @Nullable
  DLanguageFunctionAttribute getFunctionAttribute();

  @Nullable
  PsiElement getKwConst();

  @Nullable
  PsiElement getKwImmutable();

  @Nullable
  PsiElement getKwInout();

  @Nullable
  PsiElement getKwShared();

}