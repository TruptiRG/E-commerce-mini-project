package com.shop.service;

import java.util.List;

import com.shop.exception.CartException;
import com.shop.exception.OrderException;
import com.shop.exception.UserException;
import com.shop.model.Order;

public interface OrderService {
	
	public Order addOrder(Integer userId)throws OrderException, UserException, CartException;
	public Order viewOrder(Integer orderId) throws OrderException;
	public Order updateOrder(Order order) throws OrderException;
	public List<Order> viewAllOrder() throws OrderException;
	public List<Order> viewAllOrderNyUserOrder(Integer userId) throws OrderException;
	
}
