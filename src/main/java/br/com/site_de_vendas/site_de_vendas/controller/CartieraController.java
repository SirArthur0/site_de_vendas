package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.Carteira;
import br.com.site_de_vendas.site_de_vendas.model.repositories.CarteiraRepository;

@RestController
@RequestMapping("/carteira")
public class CartieraController {

	@Autowired
	private CarteiraRepository cr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastro")
	public Carteira cadastroCarteira(@Valid Carteira carteira) {
		
		cr.save(carteira);
		
		if(carteira.getId() > 0) {
			System.out.println("Carteira cadastrada com sucesso! \nCliente: " + carteira.getCliente().getNome() 
								+ "\nVendedor: " + carteira.getVendedor().getNome());
		}else{
			System.out.println("Por favor, preencha as informções corretamente.");
		}
		
			
		
		return carteira;
	}
	
}
