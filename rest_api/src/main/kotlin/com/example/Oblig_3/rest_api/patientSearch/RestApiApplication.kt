package com.example.Oblig_3.rest_api.patientSearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.hateoas.config.EnableHypermediaSupport

import org.springframework.boot.runApplication

//Denne er definert av Spring-boot og trenger ikke endres på

@SpringBootApplication
@EnableHypermediaSupport(type = [
	EnableHypermediaSupport.HypermediaType.HAL,
	EnableHypermediaSupport.HypermediaType.HAL_FORMS,
])
class RestApiApplication

fun main(args: Array<String>) {
	runApplication<RestApiApplication>(*args)
}
