package com.Trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class lote {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_lote ;
	private String lote_nombre;
	private String lote_estado;
	public String getLote_estado() {
		return lote_estado;
	}
	public void setLote_estado(String lote_estado) {
		this.lote_estado = lote_estado;
	}
	public int getId_lote() {
		return id_lote;
	}
	public void setId_lote(int id_lote) {
		this.id_lote = id_lote;
	}
	public String getLote_nombre() {
		return lote_nombre;
	}
	public void setLote_nombre(String lote_nombre) {
		this.lote_nombre = lote_nombre;
	}
	public lote() {
		super();
	}
	
	
}
