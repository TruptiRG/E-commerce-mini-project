package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
