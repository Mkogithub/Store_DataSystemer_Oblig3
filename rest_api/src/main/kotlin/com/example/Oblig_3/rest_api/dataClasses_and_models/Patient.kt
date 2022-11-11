package com.example.Oblig_3.rest_api.dataClasses_and_models


// dataclass patient definerer en Pasient: ->
// Deres Id, Fornavn, Etternavn og hvilken avdeling de er på
// kan hende vi ikke trenger dept_id her siden disse objektene er referert til i Dept
data class Patient(val id: Int, val fName: String, val lName: String, val dept_id: Int);