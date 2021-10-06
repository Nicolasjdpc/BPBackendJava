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

import com.Trainee.model.inventario;
import com.Trainee.services.servicioInventario;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/inventario")
public class transaccionesInventario {
	@Autowired
	private servicioInventario servicio;
	
	
	@GetMapping
	private ResponseEntity<List<inventario>> listarInventario (){	
			return ResponseEntity.ok(servicio.getAll());			
	}
	
	@PostMapping
	private String guardar (@RequestBody inventario Inven){		
		servicio.create(Inven);
		return "OK";
	}	
}
