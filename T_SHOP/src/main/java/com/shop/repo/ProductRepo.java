package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	
}
