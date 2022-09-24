package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.site_de_vendas.site_de_vendas.model.entities.EspecsPcNoteServer;
import br.com.site_de_vendas.site_de_vendas.model.repositories.EspecsPcNoteServerRepository;

@RestController
@RequestMapping("/epcnoteserver")
public class EspecsPcNoteServerController {
	
	@Autowired
	private EspecsPcNoteServerRepository epnsr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public EspecsPcNoteServer cadastrarEspecsPcNoteServer(@Valid EspecsPcNoteServer especsPcNoteServer) {
		
		epnsr.save(especsPcNoteServer);
		
		if(especsPcNoteServer.getId() > 0) {
			System.out.println("Especificações cadastrada com sucesso!!");
		}else {
			System.out.println("Por favor, cadestre as especificações corretamente.");
		}
		
		return especsPcNoteServer;
	}
	

}
