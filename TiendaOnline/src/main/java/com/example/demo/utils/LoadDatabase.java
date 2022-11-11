package com.example.demo.utils;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Client;
import com.example.demo.model.Pedido;
import com.example.demo.model.Product;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ClientService;
import com.example.demo.service.PedidoService;
import com.example.demo.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
	
	ArrayList<Product>idProductos = new ArrayList<Product>();
	ArrayList<Product>idProductos2 = new ArrayList<Product>();
//	Client jose = new Client((long)35563277,"José","jose1010","joseproz@gmail.com","2494222222");
//	Client juan = new Client((long)32614810,"Juan","juan89","juanmanzanel@gmail.com","2494111111");
//	Client santiago = new Client((long)32128679,"Santiago","Santoyo","santiago@gmail.com","2494333333");

	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	@Bean
	CommandLineRunner initDatabase(@Qualifier("clienteservice") ClientService clientService,@Qualifier("pedidoservice") PedidoService pedidoService,@Qualifier("productoservice") ProductService productService) {
		return args -> {
//			log.info("Preloading" + clientService.addClient(jose));
//			log.info("Preloading" + clientService.addClient(juan));
//			log.info("Preloading" + productService.addProduct(new Product((long)1, "Calzado", "Zapatillas Max Air", "Nike",38000)));
//			log.info("Preloading" +  productService.addProduct(new Product((long)2, "Campera", "Buzo River", "Adidas",20000)));
//			this.idProductos.add(new Product((long)1, "Calzado", "Zapatillas Max Air", "Nike",38000));
//			this.idProductos.add(new Product((long)2, "Campera", "River", "Adidas",20000));
//			this.idProductos2.add(new Product((long)2, "Campera", "River", "Adidas",20000));
//			this.idProductos.add(new Product((long)2, "Campera", "River", "Adidas",20000));
//			log.info("Preloading" + pedidoService.addPedido(new Pedido(idProductos,santiago)));
			//log.info("Preloading" + pedidoService.addPedido(new Pedido(idProductos,jose)));
		};
	}
}
