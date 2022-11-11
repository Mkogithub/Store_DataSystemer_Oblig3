package com.example.Oblig_3.rest_api.dataClasses_and_models


// data-klasse for department, her defineres id til department, navnet til department, ->
// og patients som er en liste med patient objekter, altså patientene som er på den departmenten
data class Dept(val id: Int, val dept_name: String, val patients: List<Patient>)