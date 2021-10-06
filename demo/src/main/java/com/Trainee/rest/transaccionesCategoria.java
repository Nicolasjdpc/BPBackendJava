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

import com.Trainee.model.categoria;
import com.Trainee.services.servicioCategoria;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/categoria")

public class transaccionesCategoria {
	@Autowired
	private servicioCategoria categoria;
	
	
	@GetMapping
	private ResponseEntity<List<categoria>> listarInventario (){	
			return ResponseEntity.ok(categoria.getAll());			
	}
	
	@PostMapping
	private String guardar (@RequestBody categoria Inven){		
		categoria.create(Inven);
		return "OK";
	}	
}
