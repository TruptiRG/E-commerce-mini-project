package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.Category;

public interface CategortRepo extends JpaRepository<Category, Integer>{

}
