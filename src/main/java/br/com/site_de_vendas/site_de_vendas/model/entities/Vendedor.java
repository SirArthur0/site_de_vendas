package br.com.site_de_vendas.site_de_vendas.model.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "vendedores")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome_vendedor", length = 70, nullable = false)
	private String nome;
	
	@Column(length = 70, nullable = false)
	private String departamento;
	
	@Column(length = 70, nullable = false, unique = true)
	private String email;

	@Column(length = 30, nullable = false)
	private String telefone;
	
	@Column(length = 1, nullable = false)
	private char status = 1;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Timestamp dtCadastro;
	
	
	public Vendedor() {
		
	}

	public Vendedor(String nome, String departamento, String email, String telefone, char status) {
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
		this.telefone = telefone;
		this.status = status;
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
	}


	public Timestamp getDtCadastro() {
		return dtCadastro;
	}


	public void setDtCadastro(Timestamp dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
}
