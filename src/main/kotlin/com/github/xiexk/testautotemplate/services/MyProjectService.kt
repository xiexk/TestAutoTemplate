package com.github.xiexk.testautotemplate.services

import com.intellij.openapi.project.Project
import com.github.xiexk.testautotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
