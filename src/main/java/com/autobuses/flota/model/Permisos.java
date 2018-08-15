package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="permisos")
@Access(AccessType.FIELD)
public class Permisos extends ParentEntity{
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name="id_rol")
	private String id_rol;
	
	@Column(name="modulo")
	private String modulo;
	
	@Column(name = "crear")
	private boolean crear;
	
	@Column(name = "ver")
	private boolean ver;
	
	@Column(name = "editar")
	private boolean editar;
	
	@Column(name = "eliminar")
	private boolean eliminar;
	
	// --------------
	
	public String getId_rol() {
		return id_rol;
	}
	public void setId_rol(String id_rol) {
		this.id_rol = id_rol;
	}
	//
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	//
	public boolean getCrear() {
		return crear;
	}
	public void setCrear(boolean crear) {
		this.crear = crear;
	}
	//
	public boolean getVer() {
		return ver;
	}
	public void setVer(boolean ver) {
		this.ver = ver;
	}
	//
	public boolean getEliminar() {
		return eliminar;
	}
	public void setEliminar(boolean eliminar) {
		this.eliminar = eliminar;
	}
	//
	public boolean getEditar() {
		return editar;
	}
	public void setEditar(boolean editar) {
		this.editar = editar;
	}

}
