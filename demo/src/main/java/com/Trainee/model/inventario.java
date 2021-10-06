package com.Trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_inventario;
	private String fech_movimiento;
	private int cantidad;
	private int id_bien;
	private int id_lote;
	public int getId_inventario() {
		return id_inventario;
	}
	public void setId_inventario(int id_inventario) {
		this.id_inventario = id_inventario;
	}
	public String getFech_movimiento() {
		return fech_movimiento;
	}
	public void setFech_movimiento(String fech_movimiento) {
		this.fech_movimiento = fech_movimiento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getId_bien() {
		return id_bien;
	}
	public void setId_bien(int id_bien) {
		this.id_bien = id_bien;
	}
	public int getId_lote() {
		return id_lote;
	}
	public void setId_lote(int id_lote) {
		this.id_lote = id_lote;
	}
	
}
