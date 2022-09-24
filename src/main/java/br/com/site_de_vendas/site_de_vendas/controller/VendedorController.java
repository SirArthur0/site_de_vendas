package br.com.site_de_vendas.site_de_vendas.controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.site_de_vendas.site_de_vendas.model.entities.Vendedor;
import br.com.site_de_vendas.site_de_vendas.model.repositories.VendedorRepository;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	private VendedorRepository vr;

	@RequestMapping(method = RequestMethod.POST, path = "/cadastro")
	public Vendedor cadastroVendedor(@Valid Vendedor vendedor){

		vr.save(vendedor);

		if(vendedor.getId() > 0) {
			System.out.println("Vendedor: " + vendedor.getNome()
								+ " cadastrado com sucesso!!"
								+ "n/ Por favor, anote sua ID: " + vendedor.getId());
		}else {
			System.out.println("Preencha os dados corretamente!");
		}
		
		return vendedor;

	}

}
