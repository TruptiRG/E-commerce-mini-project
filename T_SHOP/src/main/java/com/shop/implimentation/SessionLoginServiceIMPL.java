package com.shop.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.exception.SessionLoginException;
import com.shop.model.CurrentSession;
import com.shop.repo.CurrentSessioRepo;
import com.shop.service.SessionLoginService;

@Service
public class SessionLoginServiceIMPL implements SessionLoginService{
	
	@Autowired
	private CurrentSessioRepo csRepo;

	@Override
	public void checkLoginStatus(String key) throws SessionLoginException {
		
		CurrentSession session = csRepo.findByKey(key);
		if(session == null) {
			throw new SessionLoginException("Login required");
		}
		
		
		
	}

}
