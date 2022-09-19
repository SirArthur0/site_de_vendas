package br.com.site_de_vendas.site_de_vendas.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 50, nullable = false)
	private String estado;
	
	@Column(length = 50, nullable = false)
	private String cidade;
	
	@Column(length = 70, nullable = false)
	private String bairro;
	
	@Column(length = 70, nullable = false)
	private String rua;
	
	@Column(length = 7, nullable = false)
	private int numero;
	
	@Column(length = 10, nullable = false)
	private String cep;

	@Column(length = 1, nullable = false)
	private char status;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Cliente cliente;

	public Endereco() {
		
	}

	
	public Endereco(String estado, String cidade, String bairro, String rua, int numero, String cep, char status,
			Cliente cliente) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.status = status;
		this.cliente = cliente;
	}	
	
	public long getId(){
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
