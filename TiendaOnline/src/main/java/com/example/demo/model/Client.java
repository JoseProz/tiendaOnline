package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "cliente")
@Data
public class Client {

	@Id
	private Long dni;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false) 
	private String usuario;
	@Column(nullable = false) 
	private String email;
	@Column(length = 16) 
	private String phone;
	@OneToMany(mappedBy = "cliente")
	private List<Pedido>idpedidos;
	
	public Client() {
	}
	
	/*public Client(Long dni, String name,String usuario, String email, String phone) {
		this.dni = dni;
		this.name = name;
		this.usuario = usuario;
		this.email = email;
		this.phone = phone;
		this.idpedidos = new ArrayList<Pedido>();
	}*/
}