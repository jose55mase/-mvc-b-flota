package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "conductor")
@Access(AccessType.FIELD)
public class Conductor extends ParentEntity {
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;

	@Column(name = "cedula")
	private String cedula;

	@Column(name = "correo")
	private String correo;

	@Column(name = "telefono")
	private String telefono;

	
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "estado" )
    private boolean estado;
		
	
   
    
    public String getNombre() {
		return nombre;
	}

	public void setNombree(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstadoClave(boolean estado) {
		this.estado = estado;
	}
}