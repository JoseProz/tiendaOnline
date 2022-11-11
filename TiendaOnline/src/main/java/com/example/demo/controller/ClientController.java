package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;



@Controller
@RequestMapping("/clientes")
public class ClientController {
	
	@Autowired
	@Qualifier("clienteservice")
	private ClientService clientService;
	
//	@Autowired
//	@Qualifier("clienterepository")
//	private ClientRepository client;
	
	@GetMapping("/list")
	public ModelAndView listAllClientes() {
		ModelAndView mav = new ModelAndView("listaClientes");
		mav.addObject("clientes", clientService.listAllClient());
		mav.addObject("cliente", new Client());
		System.out.println(mav.getViewName());
		return mav;
	}
	
	@PostMapping("/addClients")
	public String addClient(@ModelAttribute(name="clientes")Client cliente) {
		clientService.addClient(cliente);
		return "redirect:/clientes/list";
	}

    
    
//	@GetMapping("")
//    public Iterable<Client> getClients(){ return client.findAll();}
//    
//    @GetMapping("/{name}")
//    public Iterable<Client>getClientByName(@PathVariable String name){ return repository.findAllByName(name);}

}

