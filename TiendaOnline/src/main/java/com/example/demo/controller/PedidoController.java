package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Client;
import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.service.PedidoService;
import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {
	private Pedido pedido = new Pedido();

	@Qualifier("pedidoservice")
    @Autowired
    private PedidoService pedidoService;
	
	@Qualifier("productoservice")
    @Autowired
    private ProductService productoService;
	
	@GetMapping("/list")
	public ModelAndView listAllPedidos() {
		
		ModelAndView mav = new ModelAndView("listaPedidos");
		mav.addObject("pedidos", pedidoService.listAllPedidos());
		mav.addObject("productoslist", productoService.listAllProducts());
		mav.addObject("pedido", new Pedido());
		return mav;
	}
	
	@PostMapping("/addPedido")
	public String addClient(@ModelAttribute(name="pedidos")Pedido pedido) {
		pedidoService.addPedido(pedido);
		return "redirect:/pedidos/list";
	}
	


//    public PedidoController(@Qualifier("pedidoRepository") PedidoRepository repository) {
//        this.repository = repository;
//    }
//    
//    @GetMapping("")
//    public Iterable<Pedido> getPedidos(){ return repository.findAll();}
//    
//    @PostMapping("/compra")
//    public Pedido newPedido(@RequestBody Pedido p) {
//        return repository.save(p);
//    }
}
