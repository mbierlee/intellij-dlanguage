// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageLabeledStatement extends PsiElement {

  @NotNull
  DLanguageIdentifier getIdentifier();

  @Nullable
  DLanguageStatement getStatement();

  @NotNull
  PsiElement getOpColon();

}