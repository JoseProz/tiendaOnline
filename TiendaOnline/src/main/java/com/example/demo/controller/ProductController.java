package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;


@Controller
@RequestMapping("/productos")
public class ProductController {
	
	@Autowired
	@Qualifier("productoservice")
  	private ProductService productService;
	
	@GetMapping("/product-list")
	public ModelAndView listAllProductos() {
		ModelAndView mav = new ModelAndView("listaProductos");
		mav.addObject("productos", productService.listAllProducts());
		
		return mav;
	}
	
	
	

//	@Qualifier("productRepository")
//    @Autowired
//    private final ProductRepository repository;
//
//    public ProductController(@Qualifier("productRepository") ProductRepository repository) {
//        this.repository = repository;
//    }
//    
//    @GetMapping("/productos")
//    public Iterable<Product> getProducts(){ return repository.findAll();}
}
