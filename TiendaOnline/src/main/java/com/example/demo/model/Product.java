package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class Product {

	@Id
	private Long codProd;
	@Column
	private String tipo;
	@Column
	private String marca;
	@Column
	private String nombre;
	@Column
	private int stock;
	@Column 
	private float precio;
	@Column
	private int cantidadVendidos;
	
	
	
	public Product() {}
	
	/*public Product(Long id,String tipo,String nombre, String marca, float precio) {
		this.codProd = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.marca = marca;
		this.stock = 0;
		this.precio = precio;
		this.cantidadVendidos = 0;
	}*/
}
