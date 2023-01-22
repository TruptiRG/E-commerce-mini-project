package com.shop.implimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.exception.CartException;
import com.shop.exception.OrderException;
import com.shop.exception.UserException;
import com.shop.model.Cart;
import com.shop.model.Order;
import com.shop.model.User;
import com.shop.repo.OrderRepo;
import com.shop.repo.UserRepo;
import com.shop.service.OrderService;

@Service
public class OderServiceIMPL implements OrderService{
	
	@Autowired
	private OrderRepo oRepo;
	
	@Autowired
	private UserRepo uRepo;

	@Override
	public Order addOrder(Integer userId) throws OrderException, UserException, CartException {
		Optional<User> o=uRepo.findById(userId);
		if(o.isEmpty()) {
			throw new UserException("User not found");
		}
		User u=o.get();
		Cart cart=u.getCart();
		Order ord=new Order();
		
//		ord.s
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
