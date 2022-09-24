package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.EspecsComponentes;
import br.com.site_de_vendas.site_de_vendas.model.repositories.EspecsComponenteRepository;

@RestController
@RequestMapping("/ecomponentes")
public class EspecsComponentesController {

	@Autowired
	private EspecsComponenteRepository ecr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public EspecsComponentes cadastrarEspecsComponentes(@Valid EspecsComponentes especsComponentes) {
		
		ecr.save(especsComponentes);
	
		if(especsComponentes.getId() >= 0) {
			System.out.println("Especificações do componente cadastrada com sucesso!");
		}
		
		
		return especsComponentes;
		
	}
	
	
}
