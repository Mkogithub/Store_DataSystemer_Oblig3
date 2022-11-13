package com.example.Oblig_3.rest_api.patientSearch.repository

import com.example.Oblig_3.rest_api.dataClasses_and_models.SymptomDBModel
import org.springframework.data.repository.CrudRepository

interface SymptomRepository: CrudRepository<SymptomDBModel, Long>