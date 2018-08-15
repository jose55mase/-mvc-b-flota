package com.autobuses.flota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autobuses.flota.dao.UserRepository;
import com.autobuses.flota.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	@Override
	public List<User> getAll(){
		return this.userRepository.getAll();
	}

	@Override
	public void deleteUser(Long id) {
		this.userRepository.delete(id);
	}
	
	public User fieldId(Long id){
		return this.userRepository.findOne(id);
	}

}
