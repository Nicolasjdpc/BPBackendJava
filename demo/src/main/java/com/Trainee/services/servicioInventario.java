package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.inventario;
import com.Trainee.repository.interfaceInventario;

@Service
public class servicioInventario {

	@Autowired
	private interfaceInventario inven;
	
	public List<inventario> getAll (){
		return inven.findAll();
	}
	
	
	public String create (inventario Inv) {
		inven.save(Inv);		
		return "OK";
	}
}
