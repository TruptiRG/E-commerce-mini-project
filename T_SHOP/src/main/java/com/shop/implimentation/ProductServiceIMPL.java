package com.shop.implimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.exception.ProductException;
import com.shop.model.Category;
import com.shop.model.Product;
import com.shop.repo.CategortRepo;
import com.shop.repo.ProductRepo;
import com.shop.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService{
	
	@Autowired
	private ProductRepo pRepo;
	
	@Autowired
	private CategortRepo cRepo;

	@Override
	public Product addProduct(Product product) throws ProductException {
		Product p = pRepo.save(product);
		if(p!=null) {
			return p;
		}else {
			throw new ProductException("Product not added");
		}
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {
		Optional<Product> opt = pRepo.findById(product.getProductId());
		if(opt.isPresent()) {
			return pRepo.save(product);
		}else {
			throw new ProductException("Product not updated");
		}
	}

	@Override
	public Product viewProductById(Integer productId) throws ProductException {
			Optional<Product> o=pRepo.findById(productId);
			if(o.isPresent()){
				return o.get();
			}else {
				throw new ProductException("Not found with ID :"+productId);
			}
	}

	@Override
	public List<Product> viewAllProduct() throws ProductException {
		List<Product> products=pRepo.findAll();
		if(products.size()==0) {
			throw new ProductException("Not found");
		}else {
			return products;
		}
	}

	@Override
	public List<Product> viewProductByCategory(Integer categoryId) throws ProductException {
		Optional<Category> o=cRepo.findById(categoryId);
		if(o.isPresent()){
			return o.get().getProducts();
		}else {
			throw new ProductException("Not found with ID :"+categoryId);
		}
	}

	@Override
	public Product deleteProduct(Integer productId) throws ProductException {
		Product p = pRepo.findById(productId).orElseThrow(()-> new ProductException("Not Found"));
		pRepo.delete(p);
		return p;
	}

}
