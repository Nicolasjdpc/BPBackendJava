package com.Trainee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.repository.interfaceBajasBien;

@RestController
@RequestMapping(path="/rest/bajaBien")
public class transaccionesBajaBien {

	@Autowired
	private interfaceBajasBien baja;	
	
	 @PutMapping("/{id}")
	 private String actualizar (@PathVariable Integer id){	
		 System.out.println("test");
			baja.BajaBien(id);
			return "OK";
		} 	
}
