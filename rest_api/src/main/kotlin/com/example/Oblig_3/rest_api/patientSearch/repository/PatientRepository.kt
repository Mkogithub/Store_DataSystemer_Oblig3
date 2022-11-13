package com.example.Oblig_3.rest_api.patientSearch

import com.example.Oblig_3.rest_api.patientSearch.repository.model.PatientDBModel
import org.springframework.data.repository.CrudRepository
import java.util.*

interface PatientRepository: CrudRepository<PatientDBModel, Long>