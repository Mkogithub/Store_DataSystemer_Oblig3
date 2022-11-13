package com.example.Oblig_3.rest_api.dataClasses_and_models

import com.example.Oblig_3.rest_api.patientSearch.repository.model.PatientDBModel
import java.util.*

class OverviewPatientModel (
    val fName: String,
    val lName: String,
    val dept_id: Int,
    val date: Date,
    val id: String
    )

fun PatientDBModel.convertToOverviewPatientModel() = OverviewPatientModel(
    fName = this.fName,
    lName = this.lName,
    dept_id = this.dept_id,
    date = this.date,
    id = this.id.toString()

)