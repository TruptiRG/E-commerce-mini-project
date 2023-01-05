package com.shop.service;

import java.util.List;

import com.shop.exception.ProductException;
import com.shop.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product) throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
	public Product viewProductById(Integer productId) throws ProductException;
	public List<Product> viewAllProduct() throws ProductException;
	public List<Product> viewProductByCategory(Integer categoryId) throws ProductException;
	public Product deleteProduct(Integer productId) throws ProductException;

}
