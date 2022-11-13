package com.example.Oblig_3.rest_api.dataClasses_and_models

import com.example.Oblig_3.rest_api.patientSearch.repository.model.PatientDBModel

class PatientModel (
    val fName: String,
    val lName: String,
    val dept_id: Int
    )

fun PatientModel.convertToDBModel() = PatientDBModel(
    fName = this.fName,
    lName = this.lName,
    dept_id = this.dept_id
)