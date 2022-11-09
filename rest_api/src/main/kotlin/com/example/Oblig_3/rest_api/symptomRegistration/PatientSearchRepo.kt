package com.example.Oblig_3.rest_api.symptomRegistration
//
//import org.springframework.stereotype.Repository
//
//@Repository
//class PatientSearchRepo {
//    var mAllPatients = mutableListOf<Patient>()
//
//    init {
//        val p1 = Patient(1, "Ola", "Nordmann", "Runny nose")
//        val p2 = Patient(2, "Kari", "Nordmann", "Heavy fever")
//
//        mAllPatients.add(p1)
//        mAllPatients.add(p2)
//    }
//
//    //get all patients
//    fun fetchAllPatients(): List<Patient>{
//        return mAllPatients
//    }
//
//    // get single patient by id
//    fun fetchPatientById(id: Int): Patient? {
//        return mAllPatients.find {
//            it.id == id
//        }
//    }
//}