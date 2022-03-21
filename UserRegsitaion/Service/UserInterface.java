package com.RegsitationForm.UserRegsitaion.Service;


import java.util.List;


import com.RegsitationForm.UserRegsitaion.Entity.User;

public interface UserInterface {

	List<User> getUser();
	public void saveOrUpdate(User user);

}
