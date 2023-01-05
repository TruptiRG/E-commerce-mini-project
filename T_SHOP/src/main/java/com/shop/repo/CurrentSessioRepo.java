package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.CurrentSession;

@Repository
public interface CurrentSessioRepo extends JpaRepository<CurrentSession, Integer>{
	
	public CurrentSession findByEmail(String email);
	
	public CurrentSession findByKey(String key);

}
