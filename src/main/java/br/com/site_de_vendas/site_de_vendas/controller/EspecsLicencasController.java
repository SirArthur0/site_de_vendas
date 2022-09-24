package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.EspecsLicencas;
import br.com.site_de_vendas.site_de_vendas.model.repositories.EspecsLicencasRepository;

@RestController
@RequestMapping("/elicencas")
public class EspecsLicencasController {
	
	@Autowired
	private EspecsLicencasRepository elr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public EspecsLicencas cadastroEspecsLicencas(@Valid EspecsLicencas especsLicencas) {
		
		elr.save(especsLicencas);
		
		if(especsLicencas.getId() >= 0) {
			System.out.println("Especificações da licença cadastrado com sucesso.");
		}else {
			System.out.println("Por favor, cadastre as informações corretamente.");
		}
		
		
		return especsLicencas;
	}

}
