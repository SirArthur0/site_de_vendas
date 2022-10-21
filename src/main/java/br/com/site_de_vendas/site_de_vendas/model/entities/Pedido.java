package br.com.site_de_vendas.site_de_vendas.model.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	private Carrinho carrinho;
	
	@OneToOne
	private StatusGenericoC sgc;
	
	@OneToOne
	private ItemPedido itemPedido;

	@Column(name = "dt_criacao")
	@CreationTimestamp
	private Timestamp dtCadastro;

	
	public Pedido() {
		
	}

	public Pedido(Carrinho carrinho, StatusGenericoC sgc, ItemPedido itemPedido) {
		this.carrinho = carrinho;
		this.sgc = sgc;
		this.itemPedido = itemPedido;		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public StatusGenericoC getSgc() {
		return sgc;
	}

	public void setSgc(StatusGenericoC sgc) {
		this.sgc = sgc;
	}

	public Timestamp getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Timestamp dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}
	
}
