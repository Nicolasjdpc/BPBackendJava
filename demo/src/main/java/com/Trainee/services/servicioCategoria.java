package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.categoria;
import com.Trainee.repository.interfaceCategoria;

@Service
public class servicioCategoria {

	@Autowired
	private interfaceCategoria cate;
	
	public List<categoria> getAll (){
		return cate.findAll();
	}	
	
	public String create (categoria cat) {
		cate.save(cat);
		return "Ok";
	}
		
}
