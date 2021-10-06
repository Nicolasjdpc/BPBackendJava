package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.lote;
import com.Trainee.repository.interfaceLote;

@Service
public class servicioLote {
	@Autowired
	private interfaceLote lote;
	
	public List<lote> getAll (){
		return lote.findAll();
	}	
	
	public String create (lote lot) {
		lote.save(lot);		
		return "OK";
	}
}
