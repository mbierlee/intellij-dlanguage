// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageFunctionLiteralBody extends PsiElement {

  @Nullable
  DLanguageBlockStatement getBlockStatement();

  @Nullable
  DLanguageBodyStatement getBodyStatement();

  @Nullable
  DLanguageFunctionContracts getFunctionContracts();

}