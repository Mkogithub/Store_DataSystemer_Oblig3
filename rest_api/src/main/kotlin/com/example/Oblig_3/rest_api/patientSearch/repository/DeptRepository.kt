package com.example.Oblig_3.rest_api.patientSearch.repository

import com.example.Oblig_3.rest_api.dataClasses_and_models.DeptDBModel
import org.springframework.data.repository.CrudRepository

interface DeptRepository: CrudRepository<DeptDBModel, Long>