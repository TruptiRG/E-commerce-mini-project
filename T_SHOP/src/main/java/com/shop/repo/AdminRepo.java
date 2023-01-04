package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
