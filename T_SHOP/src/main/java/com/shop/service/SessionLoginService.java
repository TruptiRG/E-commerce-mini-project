package com.shop.service;

import com.shop.exception.SessionLoginException;

public interface SessionLoginService {
	
	public void checkLoginStatus(String key) throws SessionLoginException;
	

}
