package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Access(AccessType.FIELD)
public class Roles extends ParentEntity {
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name = "rol")
	private String rol;
	
	public String getRol(){
		return rol;
	}
	public void setRol(String rol){
		this.rol = rol;
	}	
}
