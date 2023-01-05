package com.shop.implimentation;

import java.time.LocalDateTime;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.model.Admin;
import com.shop.model.CurrentSession;
import com.shop.model.LoginDTO;
import com.shop.model.User;
import com.shop.repo.AdminRepo;
import com.shop.repo.CurrentSessioRepo;
import com.shop.repo.UserRepo;
import com.shop.service.LoginService;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceIMPL implements LoginService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CurrentSessioRepo csRepo;
	

	@Override
	public String logInAccount(LoginDTO dto) throws LoginException {
		if(!dto.getRole().equalsIgnoreCase("user")&&!dto.getRole().equalsIgnoreCase("admin")) {
			throw new LoginException("Please specify the the role correctly 'user' or 'admin'..!");
		}
		if(dto.getRole().equalsIgnoreCase("user")) {
			User user=userRepo.findByEmail(dto.getEmail());
			if(user==null) {
				throw new LoginException("Invalid email");
			}
			if(user.getPassword().equals(dto.getPassword())) {
				CurrentSession currentSession=csRepo.findByEmail(dto.getEmail());
				if(currentSession!=null) {
					throw new LoginException("User already loggedin");
				}
				CurrentSession currentSession2=new CurrentSession();
				currentSession2.setEmail(dto.getEmail());
				currentSession2.setLocalDateTime(LocalDateTime.now());
				currentSession2.setRole("user");
				String key=RandomString.make(5);
				currentSession2.setKey(key);
				csRepo.save(currentSession2);
				return "Login Successful";
			}else {
				throw new LoginException("Enter valid password");
			}
		}else if(dto.getRole().equalsIgnoreCase("admin")) {
			Admin admin=adminRepo.findByEmail(dto.getEmail());
			if(admin==null) {
				throw new LoginException("Invalid email");
			}
			if(admin.getPassword().equals(dto.getPassword())) {
				CurrentSession currentSession=csRepo.findByEmail(dto.getEmail());
				if(currentSession!=null) {
					throw new LoginException("Admin already Loggedin");
				}
				CurrentSession currentSession2=new CurrentSession();
				currentSession2.setEmail(dto.getEmail());
				currentSession2.setLocalDateTime(LocalDateTime.now());
				currentSession2.setRole("admin");
				String key=RandomString.make(5);
				currentSession2.setKey(key);
				csRepo.save(currentSession2);
				return "Login Successful";
			}else {
				throw new LoginException("enter password correctly");
			}
		}
		return null;
	}

	@Override
	public String logOutAccount(String role, String key) throws LoginException {
		// TODO Auto-generated method stub
		return null;
	}

}
