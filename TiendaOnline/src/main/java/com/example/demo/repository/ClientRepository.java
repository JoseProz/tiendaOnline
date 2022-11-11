package com.example.demo.repository;

import com.example.demo.model.Client;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository("clienterepository")
public interface ClientRepository extends JpaRepository<Client, Long> {

	@Query("SELECT t FROM Client t where t.name = :name")
	public List<Client> findAllByName(String name);
	
	@Query("SELECT t FROM Client t where t.dni = :dni")
	public List<Client> findAllByDNI(Long dni);
}
