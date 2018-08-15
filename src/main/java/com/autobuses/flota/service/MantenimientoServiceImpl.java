package com.autobuses.flota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.MantenimientoRepository;

import com.autobuses.flota.model.Mantenimiento;


@Service
public class MantenimientoServiceImpl implements MantenimientoService  {
	@Autowired
	protected MantenimientoRepository mantenimientoRepository;

	@Override
	public Mantenimiento save(Mantenimiento mantenimientoer) {
		return this.mantenimientoRepository.save(mantenimientoer);
	}

	@Override
	public List<Mantenimiento> findAll() {
		return this.mantenimientoRepository.findAll();
	}

	@Override
	public void deleteMantenimiento(Long id) {
		this.mantenimientoRepository.delete(id);
	}
	
	public Mantenimiento fieldId(Long id){
		return this.mantenimientoRepository.findOne(id);
	}
}
