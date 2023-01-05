package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer>{

}
