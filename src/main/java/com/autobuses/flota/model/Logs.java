package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "logs")
@Access(AccessType.FIELD)
public class Logs extends ParentEntity{
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="modulo")
	private String modulo;
	
	@Column(name="accion")
	private String accion;
	
	@Column(name="fecha")
	private String fecha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
