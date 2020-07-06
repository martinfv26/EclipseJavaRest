package com.primera.aplicacion.primeraApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API_Controller {

	@GetMapping ("/nombre")
	public String getName() {
		
		String nombre = "Martin";
		
		return nombre;
		
	}
	
}
