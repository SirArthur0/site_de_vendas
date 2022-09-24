package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.Cliente;
import br.com.site_de_vendas.site_de_vendas.model.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository cr;

	@RequestMapping(method = RequestMethod.POST, path = "/cadastro")
	public Cliente cadastrarCliente(@Valid Cliente cliente) {

		cr.save(cliente);

		if(cliente.getId() > 0) {
			System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso!");
		}else {
			System.out.println("Por favor, preencha as informações corretamente!");
		}

		return cliente;

	}


}
