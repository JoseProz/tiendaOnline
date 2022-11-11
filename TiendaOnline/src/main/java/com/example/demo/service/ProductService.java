package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public abstract List<Product> listAllProducts();
	
	public abstract Product addProduct(Product producto);
	

}
