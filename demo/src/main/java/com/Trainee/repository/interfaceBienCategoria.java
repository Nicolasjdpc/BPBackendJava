package com.Trainee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.Trainee.model.bien;

public interface interfaceBienCategoria  extends JpaRepository<bien, Integer>  {
	//SELECT b.id_bien, b.nombre_bien, b.estado_bien ,b.id_cat
	@Query(" FROM bien b, categoria c where b.id_cat = c.id  and b.estado_bien='activado'")
	List<bien> busqueda() ;
	
}
