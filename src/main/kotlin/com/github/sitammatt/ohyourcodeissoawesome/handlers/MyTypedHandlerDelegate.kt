package com.github.sitammatt.ohyourcodeissoawesome.handlers

import com.github.sitammatt.ohyourcodeissoawesome.utils.extractWordFrom
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile

class MyTypedHandlerDelegate : TypedHandlerDelegate() {

    override fun charTyped(c: Char, project: Project, editor: Editor, file: PsiFile): Result {
        val word = extractWordFrom(editor.document.text, editor.caretModel.currentCaret.offset);
        if(word != null) println(word)
        return Result.CONTINUE
    }
}