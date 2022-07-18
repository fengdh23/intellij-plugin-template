package com.github.fengdh23.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.fengdh23.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
