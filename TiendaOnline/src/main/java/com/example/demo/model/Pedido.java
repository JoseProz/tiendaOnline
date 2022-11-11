package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



import lombok.Data;



@Entity
@Table(name = "pedido")
@Data
public class Pedido {
	@Id//pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Autogenera su ID o n° de transaccion en este caso
	private Long numTransaction;
	@Column 
	private LocalDate fecha;
	@Column 
	private float totalGastado;
	@ManyToMany
	@JoinTable(name = "incluye",
	joinColumns = @JoinColumn(name = "numtransaction"), 
	inverseJoinColumns = @JoinColumn(name = "codProduct"))
	private List<Product>idProductos;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "dniCliente", nullable = false)
	private Client cliente;

	
	public Pedido() {
	}
	
	/*public Pedido(List<Product>idProducto, Client x) {
		
		this.fecha = fecha.now() ;
		this.cliente = x;
		this.idProductos = new ArrayList<Product>();
		this.addProduct(idProducto);
		this.totalGastado = this.totalGastado(idProducto);
		
	}*/
	
	private void addProduct(List<Product> productos) {
		for(Product id : productos) {
			this.idProductos.add(id);
		}
	}
	
	public float totalGastado(List<Product>productos) {
		float total=0;
		for(Product p: productos) {
			total+=p.getPrecio();
		}
		return total;
	}

	
}
