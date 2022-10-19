package br.com.site_de_vendas.site_de_vendas.model.repositories;

import org.springframework.data.repository.CrudRepository;
import br.com.site_de_vendas.site_de_vendas.model.entities.Carrinho;

public interface CarrinhoRepository extends CrudRepository<Carrinho, Long>{

	
}
