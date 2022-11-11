package com.example.demo.repository;

import com.example.demo.model.Product;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("productrepository")
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT t FROM Product t where t.nombre = :nombre")
	public List<Product> findAllByName(String nombre);
	
	@Query("SELECT t FROM Product t where t.codProd = :codProd")
	public List<Product> findAllByCodProduct(Long codProd);
}

