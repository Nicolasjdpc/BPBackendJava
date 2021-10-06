package com.Trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class bien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_bien;
	private String nombre_bien;
	private String estado_bien;
	private int id_cat;
	public int getId_bien() {
		return id_bien;
	}
	public void setId_bien(int id_bien) {
		this.id_bien = id_bien;
	}
	public String getNombre_bien() {
		return nombre_bien;
	}
	public void setNombre_bien(String nombre_bien) {
		this.nombre_bien = nombre_bien;
	}
	
	public String getEstado_bien() {
		return estado_bien;
	}
	public void setEstado_bien(String estado_bien) {
		this.estado_bien = estado_bien;
	}
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	
	
}
