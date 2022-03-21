package com.RegsitationForm.UserRegsitaion.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private String email;
	private String password;
	private String Gender;
	private String Address;
	public int getId() {
		return id;
	}
	public User(int id, String fullname, String email, String password, String gender, String address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		Gender = gender;
		Address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", Gender="
				+ Gender + ", Address=" + Address + "]";
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
