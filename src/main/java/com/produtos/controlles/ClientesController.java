package com.produtos.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.produtos.models.Clientes;
import com.produtos.repository.ClientesRepository;


@Controller
public class ClientesController {
	
	@Autowired
	ClientesRepository clientesRepository;
	
	
	@RequestMapping("/cliente")
	   public ModelAndView index(){
	   return new ModelAndView("usuarios/clienteForm");
	}
	
	@RequestMapping("/listaClientes")
	@GetMapping
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("usuarios/listaClientes");
		Iterable<Clientes> cliente = clientesRepository.findAll();
		mv.addObject("clientes", cliente);
		return mv;
	}
	
	
	@PostMapping(value="/cliente")
	public String salvar(Clientes cliente) {
		clientesRepository.save(cliente);
		return "redirect:cliente";
	}

}
