package com.github.sitammatt.ohyourcodeissoawesome.handlers

import com.github.sitammatt.ohyourcodeissoawesome.utils.Notifier
import com.github.sitammatt.ohyourcodeissoawesome.utils.extractWordFrom
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile

class MyTypedHandlerDelegate : TypedHandlerDelegate() {
    private val notifier = Notifier()
    private val badWords = arrayListOf("pupa", "akwarelista")
    private val goodWords = arrayListOf("pudzian", "xD")

    override fun charTyped(c: Char, project: Project, editor: Editor, file: PsiFile): Result {
        val word = extractWordFrom(editor.document.text, editor.caretModel.currentCaret.offset);

        if(goodWords.contains(word)) notifier.makeNotification(true, project)
        if(badWords.contains(word)) notifier.makeNotification(false, project)
        return Result.CONTINUE
    }
}