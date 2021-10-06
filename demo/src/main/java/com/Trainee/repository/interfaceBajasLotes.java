package com.Trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.Trainee.model.lote;

public interface interfaceBajasLotes extends JpaRepository<lote, Integer>  {
	
	@Modifying
	@Transactional
	@Query("update lote u set  u.lote_estado='desactivado' where u.id_lote=:id_lote")		
	void BajaLote(Integer id_lote);	
}
