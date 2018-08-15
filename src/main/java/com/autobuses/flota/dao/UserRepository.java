package com.autobuses.flota.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autobuses.flota.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@SuppressWarnings("unchecked")
	User save(User user);
	User getById(Long id);
	@Query("select u from User u where u.estado = true ")
	List<User> getAll();
}
