package com.autobuses.flota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.DannosRepository;
import com.autobuses.flota.model.Dannos;



@Service
public class DannosServiceImpl implements DannosService  {
	@Autowired
	protected DannosRepository dannosRepository;

	@Override
	public Dannos save(Dannos dannos) {
		return this.dannosRepository.save(dannos);
	}

	@Override
	public List<Dannos> findAll() {
		return this.dannosRepository.findAll();
	}

	@Override
	public void deleteDannos(Long id) {
		this.dannosRepository.delete(id);
	}
	
	public Dannos fieldId(Long id){
		return this.dannosRepository.findOne(id);
	}
}
