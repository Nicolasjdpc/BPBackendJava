package com.Trainee.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.bien;
import com.Trainee.services.servicioBien;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/bien")
public class transaccionesBien {

	@Autowired
	private servicioBien bien;
	
	
	@GetMapping
	private ResponseEntity<List<bien>> listarInventario (){	
			return ResponseEntity.ok(bien.getAll());			
	}
	
	@PostMapping
	private String guardar (@RequestBody bien bn){		
		bien.create(bn);
		return "OK";
	}
}
