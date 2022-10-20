package br.com.site_de_vendas.site_de_vendas.model.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private long produto;
	
	@Column(name = "dt_criacao")
	@CreationTimestamp
	private Timestamp dtCadastro;
	
	@OneToOne
	private Carrinho carrinho;
	

	
	public ItemPedido() {
		
	}

	public ItemPedido(Carrinho carrinho, int quantidade, long idCarrinho) {
		this.carrinho = carrinho;
		this.quantidade = carrinho.getQuantidade();
		this.produto = carrinho.getProduto().getId();
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Timestamp getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Timestamp dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public long getProduto() {
		return produto;
	}

	public void setProduto(long produto) {
		this.produto = produto;
	}
	
	
}
