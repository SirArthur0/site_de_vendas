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
public class Carrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*
	decidir como implementar
	private int nr_carrinho;
	*/
	
	@Column(name = "dt_criacao")
	@CreationTimestamp
	private Timestamp dtCadastro;
	
	@Column(name = "dt_encerramento")
	@CreationTimestamp
	private Timestamp dtEncerramento;
	
	@OneToOne
	private Vendedor vendedor;
	
	@OneToOne
	private Cliente cliente;
	
	@OneToOne
	private StatusGenericoC status;

	
	public Carrinho() {
		
	}
	
	public Carrinho(Vendedor vendedor, Cliente cliente, StatusGenericoC status) {
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.status = status;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Timestamp dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Timestamp getDtEncerramento() {
		return dtEncerramento;
	}

	public void setDtEncerramento(Timestamp dtEncerramento) {
		this.dtEncerramento = dtEncerramento;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public StatusGenericoC getStatus() {
		return status;
	}

	public void setStatus(StatusGenericoC status) {
		this.status = status;
	}
	
	
}
