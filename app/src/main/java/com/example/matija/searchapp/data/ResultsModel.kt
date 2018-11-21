package com.example.matija.searchapp.data

data class ResultsModel(

    val tasks: Array<TaskModel>,
    val sections: Array<SectionModel>,
    val projects: Array<ProjectsModel>

)