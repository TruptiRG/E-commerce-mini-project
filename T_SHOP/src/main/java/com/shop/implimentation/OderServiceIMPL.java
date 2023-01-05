package com.shop.implimentation;

import java.util.List;

import com.shop.exception.CartException;
import com.shop.exception.OrderException;
import com.shop.exception.UserException;
import com.shop.model.Order;
import com.shop.service.OrderService;

public class OderServiceIMPL implements OrderService{

	@Override
	public Order addOrder(Integer userId) throws OrderException, UserException, CartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order viewOrder(Integer orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order order) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewAllOrder() throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewAllOrderNyUserOrder(Integer userId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

}
