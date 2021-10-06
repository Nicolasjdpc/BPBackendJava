package com.Trainee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.bien;
import com.Trainee.repository.interfaceBienCategoria;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/BusquedaBienesActivos")
public class transaccionesBusquedaActivosBienes {

	@Autowired
	private interfaceBienCategoria bien;
	
	
	@GetMapping
	private  ResponseEntity<List<bien>>listarInventario (){	
			return ResponseEntity.ok(bien.busqueda());	
	}
}
