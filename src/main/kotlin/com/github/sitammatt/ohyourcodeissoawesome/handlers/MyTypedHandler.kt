package com.github.sitammatt.ohyourcodeissoawesome.handlers

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.TypedActionHandler
import java.util.*
import kotlin.concurrent.schedule

import javax.management.Notification

class MyTypedHandler : TypedActionHandler {
    override fun execute(editor: Editor, charTyped: Char, dataContext: DataContext) {
        val document = editor.document
        val project = editor.project
//        WriteCommandAction.runWriteCommandAction(project) { document.insertString(0, "editor_basics\\n") }
//        WriteCommandAction.runWriteCommandAction(project) { document.insertString(editor.caretModel.offset, charTyped.toString()) }
//        editor.caretModel.moveToOffset(editor.caretModel.offset + 1)
    }

}