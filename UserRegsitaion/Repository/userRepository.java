package com.RegsitationForm.UserRegsitaion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RegsitationForm.UserRegsitaion.Entity.User;

public interface userRepository extends JpaRepository<User, Integer> {

}
