package com.Trainee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.bien;
import com.Trainee.repository.interfaceBienesPorCategoria;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="rest/busquedaCategoriaBien")
public class transaccionesSeleccionPorCategoria {

	@Autowired
	private interfaceBienesPorCategoria bienCat;
	
	@GetMapping
	@RequestMapping(path="/{id}")
	private ResponseEntity<List<bien>> listarInventario (@PathVariable Integer id){	
			return ResponseEntity.ok(bienCat.busqueda(id));			
	}
}
