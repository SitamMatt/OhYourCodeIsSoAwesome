package com.github.sitammatt.ohyourcodeissoawesome.listeners

import com.github.sitammatt.ohyourcodeissoawesome.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}
//lul ale czad :3 :**** O.O o,o <3  c==3 =0.0=