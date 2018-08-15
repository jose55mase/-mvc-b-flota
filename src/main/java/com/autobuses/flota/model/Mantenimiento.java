package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mantenimiento")
@Access(AccessType.FIELD)
public class Mantenimiento extends ParentEntity {
	
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name = "titulo")
	private String titulo; 
	
	@Column(name = "informe")
	private String informe;
	
	@Column(name = "reporte_dannos")
	private String reporte_dannos;
	
	@Column(name = "estado_vehiculo")
	private String estado_vehiculo;
	
	@Column(name = "fecha")
	private  String fecha;
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}

	public String getReporte_dannos() {
		return reporte_dannos;
	}

	public void setReporte_dannos(String reporte_dannos) {
		this.reporte_dannos = reporte_dannos;
	}

	public String getEstado_vehiculo() {
		return estado_vehiculo;
	}

	public void setEstado_vehiculo(String estado_vehiculo) {
		this.estado_vehiculo = estado_vehiculo;
	}
	
	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	public String getfecha() {
		return fecha;
	}
	
	

}
