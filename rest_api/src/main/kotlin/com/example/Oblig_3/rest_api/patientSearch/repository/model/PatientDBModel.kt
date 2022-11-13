package com.example.Oblig_3.rest_api.patientSearch.repository.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class PatientDBModel(
    val fName: String,
    val lName: String,
    val dept_id: Int,
){
    constructor() : this("r", "t", 1) {

    }

    @Id
    @GeneratedValue
    var id: Long? = null
        private set

    val date:Date = Date()
}