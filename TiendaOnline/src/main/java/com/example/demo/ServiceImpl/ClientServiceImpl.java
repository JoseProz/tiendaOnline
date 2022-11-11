package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;

@Service("clienteservice")
public class ClientServiceImpl implements ClientService {

	@Autowired//Inyeccion de dependencias 
	@Qualifier("clienterepository")
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> listAllClient() {
		return clientRepository.findAll();
	}

	@Override
	public Client addClient(Client cliente) {
		return clientRepository.save(cliente);
	}

}
