package com.autobuses.flota.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autobuses.flota.model.Logs;

public interface LogsRepository extends JpaRepository<Logs, Long>  {
	@SuppressWarnings("unchecked")
	@Query("SELECT l FROM Logs l order BY l.id DESC")
	List<Logs> findGetAll();
}
