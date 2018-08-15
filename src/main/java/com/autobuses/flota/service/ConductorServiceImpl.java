package com.autobuses.flota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.ConductorRepository;
import com.autobuses.flota.model.Conductor;;

@Service
public class ConductorServiceImpl implements ConductorService {
	@Autowired
	protected ConductorRepository conductorRepository;

	@Override
	public Conductor save(Conductor conductor) {
		return this.conductorRepository.save(conductor);
	}

	@Override
	public List<Conductor> findAll() {
		return this.conductorRepository.findAll();
	}
	@Override
	public List<Conductor> getConductorTrue(){
		return this.conductorRepository.getConductorTrue();
	}

	@Override
	public void deleteConductor(Long id) {
		this.conductorRepository.delete(id);
	}
	
	public Conductor fieldId(Long id){
		return this.conductorRepository.findOne(id);
	}

}
