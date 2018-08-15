package com.autobuses.flota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.VehiculoRepository;

import com.autobuses.flota.model.Vehiculo;

@Service
public class VeiculoServiceImpl implements VehiculoService{

	@Autowired
	protected VehiculoRepository vehiculoRepository;

	@Override
	public Vehiculo save(Vehiculo vehiculo) {
		return this.vehiculoRepository.save(vehiculo);
	}

	@Override
	public List<Vehiculo> findAll() {
		return this.vehiculoRepository.getAllVehiculos();
	}
	@Override
	public List<Vehiculo> getVehiculos(){
		return this.vehiculoRepository.getVehiculos();
	}

	@Override
	public void deleteVehiculo(Long id) {
		this.vehiculoRepository.delete(id);
	}
	
	public Vehiculo fieldId(Long id){
		return this.vehiculoRepository.findOne(id);
	}

}
