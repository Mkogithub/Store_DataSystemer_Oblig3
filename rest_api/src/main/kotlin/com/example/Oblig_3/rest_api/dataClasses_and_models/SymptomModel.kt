package com.example.Oblig_3.rest_api.dataClasses_and_models

class SymptomModel (
    val Symptom: String,
    val danger_level: Int
        )


fun SymptomModel.convertToDBModel() = SymptomDBModel(
    Symptom = this.Symptom,
    danger_level = this.danger_level
)
