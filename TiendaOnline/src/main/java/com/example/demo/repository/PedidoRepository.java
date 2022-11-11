package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;
import com.example.demo.model.Pedido;

@Repository("pedidorepository")
public interface PedidoRepository extends JpaRepository<Pedido,Long>{
	@Query("SELECT t FROM Pedido t where t.numTransaction = :numTransaction")
	public List<Client> findAllByPedido(Long numTransaction);
	
	
}
