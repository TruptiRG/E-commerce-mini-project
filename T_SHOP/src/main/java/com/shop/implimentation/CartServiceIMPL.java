package com.shop.implimentation;

import com.shop.exception.CartException;
import com.shop.exception.ProductException;
import com.shop.exception.UserException;
import com.shop.model.Cart;
import com.shop.service.CartService;

public class CartServiceIMPL implements CartService{

	@Override
	public Cart addProductToCart(Integer userId, Integer productId)
			throws CartException, UserException, ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeProductFromCart(Integer userId, Integer productId)
			throws CartException, UserException, ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart removeAllProducts(Integer userId) throws CartException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart addProductQuantity(Integer userId, Integer ProductId)
			throws CartException, UserException, ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart reduceProductQuantity(Integer userId, Integer ProductId)
			throws CartException, UserException, ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
