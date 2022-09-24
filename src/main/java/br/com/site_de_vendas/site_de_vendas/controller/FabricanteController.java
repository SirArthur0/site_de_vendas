package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.Fabricante;
import br.com.site_de_vendas.site_de_vendas.model.repositories.FabricanteRepository;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
	
	@Autowired
	private FabricanteRepository fr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastro")
	public Fabricante cadastrarFabricante(@Valid Fabricante fabricante) {
		
		fr.save(fabricante);
		
		if(fabricante.getId() > 0) {
			System.out.println("Fabricante " + fabricante.getNomeFabricante() + " cadastrado com sucesso!");
		}else {
			System.out.println("Por favor, digite as informações corretamente.");
		}
		
		return fabricante;
	}
	
}
