package br.com.site_de_vendas.site_de_vendas.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.site_de_vendas.site_de_vendas.model.entities.Carrinho;
import br.com.site_de_vendas.site_de_vendas.model.entities.ItemPedido;
import br.com.site_de_vendas.site_de_vendas.model.entities.Pedido;
import br.com.site_de_vendas.site_de_vendas.model.repositories.CarrinhoRepository;
import br.com.site_de_vendas.site_de_vendas.model.repositories.ItemPedidoRepository;
import br.com.site_de_vendas.site_de_vendas.model.repositories.PedidoRepository;

@RequestMapping("/carrinho")
@RestController
public class CarrinhoController {
	
	
	@Autowired
	private CarrinhoRepository cr;
	
	@Autowired
	private ItemPedidoRepository ipr;
	
	@Autowired
	private PedidoRepository pr;
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/salvar")
	public Carrinho acessarCarrinho(@Valid Carrinho carrinho, ItemPedido itempedido, Pedido pedido) {
		
		cr.save(carrinho);
		
		if(carrinho.getId() > 0 && carrinho.getProduto().getNomeProduto() != null) {
			System.out.println("Carrinho criado! \nProduto: " + carrinho.getProduto().getNomeProduto() 
					+ "\nPreço unitário: " + carrinho.getProduto().getValorUni()
						+ "\nVendedor: " + carrinho.getVendedor().getNome());
			
			itempedido.setCarrinho(carrinho);
			itempedido.setQuantidade(carrinho.getQuantidade());
			itempedido.setProduto(carrinho.getProduto().getId());
			ipr.save(itempedido);
			}
		
		if(carrinho.getStatus().getId() == 1) {
			pedido.setCarrinho(carrinho);
			pedido.setItemPedido(itempedido);
			pedido.setSgc(carrinho.getStatus());
			pr.save(pedido);
		}
		
		return carrinho;
	}
	
}
