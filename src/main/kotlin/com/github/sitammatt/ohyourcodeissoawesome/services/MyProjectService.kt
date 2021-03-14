package com.github.sitammatt.ohyourcodeissoawesome.services

import com.github.sitammatt.ohyourcodeissoawesome.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
