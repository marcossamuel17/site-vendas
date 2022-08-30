package com.produtos.controlles;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.produtos.models.Produtos;
import com.produtos.models.VendasProdutos;
import com.produtos.repository.ProdutosRepository;
import com.produtos.repository.VendasProdutosRepository;

@Controller
public class VendasProdutosController {
	
	@Autowired
	ProdutosRepository produtoRepository;
	
	@Autowired
	VendasProdutosRepository vendasProdutosRepository;
	
	@GetMapping("/carrinho")
	public String exibir() {
		return "estoque/carrinho";
	}
	
	@RequestMapping(value="/{prdutoID}", method=RequestMethod.POST)
	public String detalhesEventoPost(@PathVariable("prdutoID") long prdutoID, @Valid VendasProdutos vendasProdutos,  BindingResult result, RedirectAttributes attributes){
		
		Produtos produto = produtoRepository.findById(prdutoID);
		vendasProdutos.setProduto(produto);
		vendasProdutosRepository.save(vendasProdutos);
		
		return "redirect:/{prdutoID}";
	}

}
