package com.shop.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.exception.UserException;
import com.shop.model.User;
import com.shop.repo.UserRepo;
import com.shop.service.UserService;

@Service
public class UserServiceIMPL implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User addUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Integer userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> viewAllUser() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
