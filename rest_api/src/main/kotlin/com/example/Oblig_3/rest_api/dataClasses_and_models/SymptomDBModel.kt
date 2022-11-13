package com.example.Oblig_3.rest_api.dataClasses_and_models

import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.Id

class SymptomDBModel (
    val Symptom: String,
    val danger_level: Int,
    ) {
    constructor() : this("ouchie", 1){}
    @Id
    @GeneratedValue
    var id: Long? = null
        private set

    val date: Date = Date()
}