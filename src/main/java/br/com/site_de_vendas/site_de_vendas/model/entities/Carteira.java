package br.com.site_de_vendas.site_de_vendas.model.entities;

import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "carteira_cliente")
public class Carteira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Vendedor vendedor;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Cliente cliente;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Timestamp dtCadastro;

	
	public Carteira() {
		
	}
	
	public Carteira(Vendedor vendedor, Cliente cliente) {
		this.vendedor = vendedor;
		this.cliente = cliente;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Timestamp getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Timestamp dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
}
