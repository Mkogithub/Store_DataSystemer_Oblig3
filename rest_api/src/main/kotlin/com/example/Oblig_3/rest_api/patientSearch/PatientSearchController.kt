package com.example.Oblig_3.rest_api.patientSearch

import com.example.Oblig_3.rest_api.dataClasses_and_models.Patient
import com.example.Oblig_3.rest_api.dataClasses_and_models.Symptom
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


//Definerer det som en RestController, her defineres hva som skal skje når en Url på siden besøkes
@RestController
@RequestMapping("patientSearch")
class PatientSearchController {

    @Autowired
    //henter inn repository
    val patientSearchRepo = PatientSearchRepo()


    // GetMapping definerer hva som skjer når en get request sendes til url-en
    // Det finnes forskjellige mappings for forskjellige requests
    // og f.eks RequestMapping
    @GetMapping("/all")
    // her henter vi ut alle pasienter med hjelp PatientSearchRepo sin fetchAllPatients
    fun getAllPatients(): List<Patient>{
        return patientSearchRepo.fetchAllPatients()
    }

    // her får vi id som argument i url, i nettleser gir dette http://localhost:8080/patientSearch/1 o.s.v
    @GetMapping("/{id}")
    // henter eb enkelt pasient basert på deres id
    fun getPatientById(@PathVariable id: Int): Patient? {
        return patientSearchRepo.fetchPatientById(id)
    }

    @GetMapping("/getSymptoms")
    //henter ut symptomer, anbefaler at denne legges under SymptomRegistration med eget Repo
    fun getAllSymptoms(): List<Symptom>{
        return patientSearchRepo.fetchAllSymptoms()
    }


}