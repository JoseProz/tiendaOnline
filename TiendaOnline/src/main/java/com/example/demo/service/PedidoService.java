package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Client;
import com.example.demo.model.Pedido;

public interface PedidoService {
	
	public abstract List<Pedido> listAllPedidos();
	
	public abstract Pedido addPedido(Pedido pedido);

}
