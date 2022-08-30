package com.produtos.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.produtos.models.Gerente;
import com.produtos.repository.GerenteRepository;

@Controller
public class GerenteController {
	
	@Autowired
	GerenteRepository gerenteRepository;
	
	@RequestMapping("/gerente")
	public String formGerente() {
		return "usuarios/gerenteForm";
	}
	
	@RequestMapping("/paginaGerente")
	   public ModelAndView indexGerente(){
	   return new ModelAndView("usuarios/pagGerente");
	}
	
	@PostMapping("/gerente")
	public String form(Gerente gerente) {
		gerenteRepository.save(gerente);
		return "redirect:/gerente";
	}

}
