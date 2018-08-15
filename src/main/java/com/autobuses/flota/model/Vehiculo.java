package com.autobuses.flota.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "vehiculo")
@Access(AccessType.FIELD)
public class Vehiculo extends ParentEntity {
	
	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "capasidad_carga")
	private String capasidad_carga;
	
	@Column(name = "tipo_motor")
	private String tipo_motor;
	
	@Column(name = "tipo_caja_velocidad")
	private String tipo_caja_velocidad;
	
	@Column(name = "trasmision")
	private String trasmision;
	
	@Column(name = "numero_eje")
	private String numero_eje;
	
	@Column(name = "municipio_matricula")
	private String municipio_matricula;
	
	@Column(name = "numero_motor")
	private String numero_motor;

	@Column(name = "placa")
	private String placa;
	
	@Column(name = "propietario")
	private String propietario;
	
	@Column(name = "estado")
	private boolean estado;

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCapasidad_carga() {
		return capasidad_carga;
	}

	public void setCapasidad_carga(String capasidad_carga) {
		this.capasidad_carga = capasidad_carga;
	}

	public String getTipo_motor() {
		return tipo_motor;
	}

	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}

	public String getTipo_caja_velocidad() {
		return tipo_caja_velocidad;
	}

	public void setTipo_caja_velocidad(String tipo_caja_velocidad) {
		this.tipo_caja_velocidad = tipo_caja_velocidad;
	}

	public String getTrasmision() {
		return trasmision;
	}

	public void setTrasmision(String trasmision) {
		this.trasmision = trasmision;
	}

	public String getNumero_eje() {
		return numero_eje;
	}

	public void setNumero_eje(String numero_eje) {
		this.numero_eje = numero_eje;
	}

	public String getMunicipio_matricula() {
		return municipio_matricula;
	}

	public void setMunicipio_matricula(String municipio_matricula) {
		this.municipio_matricula = municipio_matricula;
	}

	public String getNumero_motor() {
		return numero_motor;
	}

	public void setNumero_motor(String numero_motor) {
		this.numero_motor = numero_motor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}