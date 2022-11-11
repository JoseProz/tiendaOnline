package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.model.Pedido;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.PedidoService;

@Service("pedidoservice")
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired//Inyeccion de dependencias 
	@Qualifier("pedidorepository")
	private PedidoRepository pedidoRepository;
	
	@Autowired
	@Qualifier("productrepository")
	private ProductRepository productoRepository;
	

	@Override
	public List<Pedido> listAllPedidos() {
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido addPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

}
