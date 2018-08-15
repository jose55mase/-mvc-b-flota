package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dannos")
@Access(AccessType.FIELD)
public class Dannos extends ParentEntity {
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name = "informe")
	private String informe;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "vehiculo")
	private String vehiculo;
	
	public String getInforme() {
		return informe;
	}
	public void setInforme(String informe) { this.informe = informe; }
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
