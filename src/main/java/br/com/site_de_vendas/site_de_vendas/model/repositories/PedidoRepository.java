package br.com.site_de_vendas.site_de_vendas.model.repositories;

import org.springframework.data.repository.CrudRepository;
import br.com.site_de_vendas.site_de_vendas.model.entities.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
