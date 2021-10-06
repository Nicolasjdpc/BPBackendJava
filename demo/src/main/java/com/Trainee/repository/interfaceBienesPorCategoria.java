package com.Trainee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Trainee.model.bien;

public interface interfaceBienesPorCategoria  extends JpaRepository <bien, Integer>  {
	//SELECT b.id_bien, b.nombre_bien, b.estado_bien ,b.id_cat
	@Query("SELECT b FROM bien b where b.id_cat= ?1")
	List<bien> busqueda(Integer id_cat) ;
}
