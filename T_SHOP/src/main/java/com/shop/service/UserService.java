package com.shop.service;

import java.util.List;

import com.shop.exception.UserException;
import com.shop.model.User;

public interface UserService {
	
	public User addUser(User user) throws UserException;
	public User updateUser(User user) throws UserException;
	public User deleteUser(Integer userId) throws UserException;
	public List<User> viewAllUser() throws UserException;

}
