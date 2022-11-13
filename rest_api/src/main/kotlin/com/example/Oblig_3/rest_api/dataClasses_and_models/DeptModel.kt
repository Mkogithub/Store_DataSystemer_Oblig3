package com.example.Oblig_3.rest_api.dataClasses_and_models

class DeptModel (
    val dept_name: String,
        )

fun DeptModel.convertToDBModel() = DeptDBModel(
    dept_name = this.dept_name
)
