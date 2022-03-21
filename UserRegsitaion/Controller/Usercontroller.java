package com.RegsitationForm.UserRegsitaion.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RegsitationForm.UserRegsitaion.Entity.User;
import com.RegsitationForm.UserRegsitaion.Service.UserImpService;

@RestController
public class Usercontroller {

	@Autowired
	private UserImpService service;
	
	@PostMapping("/Save")
    public User SaveAll(User user)	
    {
		service.SaveAll(user);
		return user;
    }
	@GetMapping("/Get")
	public List<User> getAll()
	{
		
		return service.getUser();
	}
    
}
