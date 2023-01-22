package com.shop.implimentation;

import java.util.List;
import java.util.Optional;

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
		User adduser=userRepo.save(user);
		if(adduser==null) {
			throw new UserException("User not added...");
		}else {
			return adduser;
		}		
	}

	@Override
	public User updateUser(User user) throws UserException {
		User u=userRepo.findByEmail(user.getEmail());
		if(u!=null) {
			userRepo.save(u);
		}
		return u;
	}

	@Override
	public User deleteUser(Integer userId) throws UserException {
		Optional<User> opt = userRepo.findById(userId);
		if(opt.isPresent()) {
			User user = opt.get();
			userRepo.delete(user);
			return user;
		}else {
			throw new UserException("User not found");
		}
		
	}

	@Override
	public List<User> viewAllUser() throws UserException {
		List<User> users =userRepo.findAll();
		if(users.size()>0) {
			return users;
		}else {
			throw new UserException("User not found");
		}
	}

}
