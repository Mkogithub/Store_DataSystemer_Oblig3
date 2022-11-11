package com.example.Oblig_3.rest_api.patientSearch

import com.example.Oblig_3.rest_api.dataClasses_and_models.Patient
import com.example.Oblig_3.rest_api.dataClasses_and_models.Symptom
import org.springframework.stereotype.Repository

@Repository
class PatientSearchRepo {
    final var mAllPatients = mutableListOf<Patient>()
    final var mAllSymptoms = mutableListOf<Symptom>()

    init {
        // Adding two patients just to get started
        val p1 = Patient(1, "Ola", "Nordmann", 1)
        val p2 = Patient(2, "Kari", "Nordmann", 1)

        mAllPatients.add(p1)
        mAllPatients.add(p2)

        // Initializing all Symptoms
            // common symptoms
        val s1 = Symptom(1, "Fever", 1)
        val s2 = Symptom(2, "Cough", 1)
        val s3 = Symptom(3, "Tiredness", 1)
        val s4 = Symptom(4, "Loss of taste or smell", 1)

            // uncommon symptoms
        val s5 = Symptom(5, "Sore Throat", 2)
        val s6 = Symptom(6, "HeadAche", 2)
        val s7 = Symptom(7, "Aching body", 2)
        val s8 = Symptom(8, "Dihareea", 2)

            // Serious Symptoms
        val s9 = Symptom(9, "Breathing issues", 3)
        val s10 = Symptom(10, "Loss of movement", 3)
        val s11 = Symptom(11, "Chest Pains", 3)

        val list1 = listOf<Symptom>(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11)
        mAllSymptoms.addAll(list1)

    }

    //get all patients
    fun fetchAllPatients(): List<Patient>{
        return mAllPatients
    }

    // get single patient by id
    fun fetchPatientById(id: Int): Patient? {
        return mAllPatients.find {
            it.id == id
        }
    }

    // Get all Symptoms (must be moved)
    fun fetchAllSymptoms(): List<Symptom>{
        return mAllSymptoms
    }

    // Get one Symptom by id (must be moved)
    fun fetchSymptomById(id: Int): Symptom? {
        return mAllSymptoms.find {
            it.id == id
        }
    }
}