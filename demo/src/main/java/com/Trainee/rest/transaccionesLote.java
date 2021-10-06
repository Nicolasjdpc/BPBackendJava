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

import com.Trainee.model.lote;
import com.Trainee.services.servicioLote;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="rest/lote")
public class transaccionesLote {

	@Autowired
	private servicioLote lote;
	
	@GetMapping
	private ResponseEntity<List<lote>> listarInventario (){			
			return ResponseEntity.ok(lote.getAll());			
	}
	
	@PostMapping
	private String guardar (@RequestBody lote Inven){		
		lote.create(Inven);
		return "OK";
	}
}
