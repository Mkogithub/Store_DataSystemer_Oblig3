package com.example.Oblig_3.rest_api.symptomRegistration

//import com.example.Oblig_3.rest_api.dataClasses.Patient
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.PathVariable
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//class PatientSearchController {
//
//    @Autowired
//    val patientSearchRepo = PatientSearchRepo()
//
//    @GetMapping("/patientSearch")
//    fun getAllPatients(): List<Patient>{
//        return patientSearchRepo.fetchAllPatients()
//    }
//
//    @GetMapping("/patientSearch/{id}")
//    fun getEmployeeById(@PathVariable id: Int): Patient? {
//        return patientSearchRepo.fetchPatientById(id)
//    }
//}