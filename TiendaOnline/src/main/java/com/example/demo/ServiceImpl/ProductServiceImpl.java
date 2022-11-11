package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service("productoservice")
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier("productrepository")
	private ProductRepository productRepository;
	@Override
	public List<Product> listAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product producto) {
		return productRepository.save(producto);
	}

}
