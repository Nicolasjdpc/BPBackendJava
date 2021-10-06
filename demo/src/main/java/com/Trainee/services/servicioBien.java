package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.bien;
import com.Trainee.repository.interfaceBien;

@Service
public class servicioBien {

	@Autowired
	private interfaceBien bien;
	
	public List<bien> getAll (){
		return bien.findAll();
	}	
	
	public String create (bien bn) {
		bien.save(bn);		
		return "OK";
	}
}
