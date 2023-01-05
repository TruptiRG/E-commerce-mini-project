package com.shop.service;

import javax.security.auth.login.LoginException;

import com.shop.model.LoginDTO;

public interface LoginService {
	
	public String logInAccount(LoginDTO dto) throws LoginException;
	public String logOutAccount(String role, String key) throws LoginException;

}
