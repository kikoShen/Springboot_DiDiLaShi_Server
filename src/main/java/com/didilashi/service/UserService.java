package com.didilashi.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.didilashi.bean.User;
import com.didilashi.repository.UserRepository;

@Service
public class UserService {

	@Resource
	private UserRepository userRepository;
	@Transactional
	public  void save(User user){
		userRepository.save(user);
	}
	@Transactional
	public void delete(int id){
		userRepository.delete(id);
	}
	
	public Iterable<User> getAll(){
		return userRepository.findAll();		
	}
	
	public Iterable<User> findByPhone(String phone){
		return userRepository.findByPhone(phone);		
	}
	public User findByUsername(String username){
		return userRepository.findByUsername(username);		
	}
	
	public User qFind(String username){
		return userRepository.QFind(username);		
	}
}
