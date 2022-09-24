package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.Produto;
import br.com.site_de_vendas.site_de_vendas.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository pr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public Produto cadastrarProduto(@Valid Produto produto) {
		
		pr.save(produto);
		
		if(produto.getId() > 0) {
			System.out.println("Produto " + produto.getNomeProduto() + " cadastrado com sucesso!!");
		}else {
			System.out.println("Produto não cadastrado, por favor preenchas as informações corretamente.");
		}
		
		return produto;
	}
	
}
