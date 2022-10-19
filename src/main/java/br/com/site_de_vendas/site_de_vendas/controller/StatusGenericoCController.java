package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.site_de_vendas.site_de_vendas.model.entities.StatusGenericoC;
import br.com.site_de_vendas.site_de_vendas.model.repositories.StatusGenericoCRepository;

@RequestMapping("/statusgc")
@RestController
public class StatusGenericoCController {
	
	@Autowired
	private StatusGenericoCRepository sr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastro")
	public StatusGenericoC cadastroStatus(@Valid StatusGenericoC sgc) {
		
		sr.save(sgc);
		
		if(sgc.getId() > 0) {
			System.out.println("Status cadastrdo com sucesso!");
		}else {
			System.out.println("Algo deu errado, tente novamente.");
		}
		
		return sgc;
	}
	
	
}
