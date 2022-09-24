package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.site_de_vendas.site_de_vendas.model.entities.Endereco;
import br.com.site_de_vendas.site_de_vendas.model.repositories.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	
	@Autowired
	private EnderecoRepository er;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastro")
	public Endereco addEndereco(@Valid Endereco endereco) {
		
		er.save(endereco);
		
		if(endereco.getId() > 0) {
			System.out.println("Endereço cadastrado com sucesso!");
		}else {
			System.out.println("Por favor preencha as informações corretamente.");
		}
		
		return endereco;
	}
	
}
