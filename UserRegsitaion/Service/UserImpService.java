package com.RegsitationForm.UserRegsitaion.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.RegsitationForm.UserRegsitaion.Entity.User;
import com.RegsitationForm.UserRegsitaion.Repository.userRepository;

@Service
public class UserImpService implements UserInterface
{
   @Autowired
	   private userRepository UserRepository;
	   
 
  
   //Post
     public void SaveAll(User user)
     {
    	 
    	UserRepository.save(user);
    	
    	
     }
     //get
     
    
     

	@Override
	public void saveOrUpdate(User user) {
		UserRepository.save(user);
	}
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}
	   
 }
