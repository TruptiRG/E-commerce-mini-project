package com.shop.service;

import com.shop.exception.CartException;
import com.shop.exception.ProductException;
import com.shop.exception.UserException;
import com.shop.model.Cart;

public interface CartService {
	
	public Cart addProductToCart(Integer userId, Integer productId) throws CartException, UserException, ProductException;
	public Cart removeProductFromCart(Integer userId, Integer productId) throws CartException, UserException, ProductException;
	public Cart removeAllProducts(Integer userId) throws CartException, UserException;
	public Cart addProductQuantity(Integer userId, Integer ProductId) throws CartException, UserException, ProductException;
	public Cart reduceProductQuantity(Integer userId, Integer ProductId) throws CartException, UserException, ProductException;

}
