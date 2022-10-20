package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.site_de_vendas.site_de_vendas.model.entities.Carrinho;
import br.com.site_de_vendas.site_de_vendas.model.entities.ItemPedido;
import br.com.site_de_vendas.site_de_vendas.model.repositories.CarrinhoRepository;
import br.com.site_de_vendas.site_de_vendas.model.repositories.ItemPedidoRepository;


@RequestMapping("/carrinho")
@RestController
public class CarrinhoController {
	
	@Autowired
	private CarrinhoRepository cr;
	
	@Autowired
	private ItemPedidoRepository ipr;
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/salvar")
	public Carrinho acessarCarrinho(@Valid Carrinho carrinho, ItemPedido itempedido) {
		
		cr.save(carrinho);
		
		
		if(carrinho.getProduto().getNomeProduto() == null){
			System.out.println("Não possui produtos no carrinho.");
		} else if(carrinho.getId() > 0 && carrinho.getProduto().getNomeProduto() != null) {
			System.out.println("Carrinho criado! \nProduto: " + carrinho.getProduto().getNomeProduto() 
					+ "\nPreço unitário: " + carrinho.getProduto().getValorUni()
						+ "\nVendedor: " + carrinho.getVendedor().getNome());
			
			itempedido.setCarrinho(carrinho);
			itempedido.setQuantidade(carrinho.getQuantidade());
			itempedido.setProduto(carrinho.getProduto().getId());
			ipr.save(itempedido);
			
			}
		
		return carrinho;
	}
	

}
