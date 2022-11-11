package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Client;

public interface ClientService {
	
	public abstract List<Client> listAllClient();
	
	public abstract Client addClient(Client cliente);

}
