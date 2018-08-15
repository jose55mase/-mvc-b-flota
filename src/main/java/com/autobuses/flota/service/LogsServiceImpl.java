package com.autobuses.flota.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.LogsRepository;
import com.autobuses.flota.model.Logs;;

@Service
public class LogsServiceImpl implements LogsService{
	@Autowired
	protected LogsRepository logsRepository;
	@Override
	public Logs save (Logs logs) {
		return this.logsRepository.save(logs);
	}
	@Override
	public List<Logs> findAll(){
		return this.logsRepository.findAll();
	}
	@Override
	public void deteleLogs(Logs id) {
		this.logsRepository.delete(id);
	}
	@Override
	public List<Logs> findGetAll(){
		return logsRepository.findGetAll();
	}
	

}
