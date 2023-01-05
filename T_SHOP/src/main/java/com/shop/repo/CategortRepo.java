package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Category;

@Repository
public interface CategortRepo extends JpaRepository<Category, Integer>{

}
