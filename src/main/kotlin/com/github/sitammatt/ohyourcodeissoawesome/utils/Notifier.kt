package com.github.sitammatt.ohyourcodeissoawesome.utils

import com.intellij.notification.Notification
import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule
import kotlin.random.Random.Default.nextInt

class Notifier {
    private val nGroup: NotificationGroup = NotificationGroup("Custom Group", NotificationDisplayType.BALLOON, false)
    private val pCommunicates = arrayListOf("Bardzo ładnie", "Tak trzymaj", "Świetnie")
    private val nCommunicates = arrayListOf("Nieładnie", "Popraw się", "Popracuj nad tym")

    fun makeNotification(positive: Boolean, project: Project) {
        val notification: Notification = if (positive) {
            nGroup.createNotification(pCommunicates[Random().nextInt(pCommunicates.size)], NotificationType.INFORMATION)
        }
        else {
            nGroup.createNotification(nCommunicates[Random().nextInt(nCommunicates.size)], NotificationType.INFORMATION)
        }
        notification.notify(project)
        val timer = Timer()
        timer.schedule(1000) {
            notification.expire()
        }
    }
}