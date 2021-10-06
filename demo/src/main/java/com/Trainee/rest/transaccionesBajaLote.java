package com.Trainee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.repository.interfaceBajasLotes;

@RestController
@RequestMapping(path="/rest/bajaLote")
public class transaccionesBajaLote {

	@Autowired
	private interfaceBajasLotes bajas;	
	
	 @PutMapping("/{id}")
	 private String actualizar (@PathVariable Integer id){			
			bajas.BajaLote(id);
			return "OK";
		} 	
}
