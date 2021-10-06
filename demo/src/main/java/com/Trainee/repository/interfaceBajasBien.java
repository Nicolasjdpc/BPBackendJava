package com.Trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.Trainee.model.bien;

public interface interfaceBajasBien extends JpaRepository<bien, Integer>  {
	
	@Modifying
	@Transactional
	@Query("update bien u set  u.estado_bien='desactivado' where u.id_bien=:id_bien")	
	void BajaBien(Integer id_bien);	
	
}
