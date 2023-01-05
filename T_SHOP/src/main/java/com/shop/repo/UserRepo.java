package com.shop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.model.Order;
import com.shop.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	@Query("select u.orders from User u where u.userId=?1")
	public List<Order> getAllOrderById(Integer userId);
	
	public User findByEmail(String email);

}
