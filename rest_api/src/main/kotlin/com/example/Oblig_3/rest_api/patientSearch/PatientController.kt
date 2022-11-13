package com.example.Oblig_3.rest_api.patientSearch

import com.example.Oblig_3.rest_api.dataClasses_and_models.OverviewPatientModel
import com.example.Oblig_3.rest_api.dataClasses_and_models.PatientModel
import com.example.Oblig_3.rest_api.dataClasses_and_models.convertToDBModel
import com.example.Oblig_3.rest_api.dataClasses_and_models.convertToOverviewPatientModel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/patients")
class PatientController(val repository: PatientRepository) {

    @PostMapping("/new")
    fun newPatient(@RequestBody transactionModel: PatientModel): String {
        repository.save(transactionModel.convertToDBModel())
        return "Saved"
    }


    @GetMapping("/all")
    fun getAllPatients(): List<OverviewPatientModel> {
        return repository.findAll().map { it.convertToOverviewPatientModel() }
    }

    @GetMapping("")
    fun getPatientById(@RequestParam id: Int?) {
        id?.toLong()?.let { repository.findById(it) }
    }

    @DeleteMapping("/delete")
    fun deletePatientById(@RequestParam id: Int?){
        id?.toLong()?.let { repository.deleteById(it) }
    }

//    @DeleteMapping("/delete")
//    fun deletePatientByName(@RequestParam fName:String?, @RequestParam lName:String?){
//
//    }


}