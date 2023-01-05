package com.shop.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.exception.AdminException;
import com.shop.model.Admin;
import com.shop.repo.AdminRepo;
import com.shop.service.AdminSrevice;

@Service
public class AdminServiceIMPL implements AdminSrevice{

	@Autowired
	private AdminRepo aRepo;
	
	
	@Override
	public String createNewAdmin() throws AdminException {
		String name="Admin";
		String email="a@gmail.com";
		String password="sonu";
		
		Admin avlAdmin =aRepo.findByEmail(email);
		if(avlAdmin!=null) {
			throw new AdminException("Admin already available with Email :"+email+" and Password :"+password);
		}
		
		Admin admin = new Admin();
		admin.setName(name);
		admin.setEmail(email);
		admin.setPassword(password);
		
		aRepo.save(admin);
		return "With Email :"+email+" and Password :"+password+" Admin Created. :)";
	}

}
