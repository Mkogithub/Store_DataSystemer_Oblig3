package com.example.Oblig_3.rest_api.dataClasses_and_models

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DeptDBModel (
    val dept_name: String,
) {
    constructor() : this("r") {
    }
    @Id
    @GeneratedValue
    var id: Long? = null
        private set

    val date:Date = Date()
}