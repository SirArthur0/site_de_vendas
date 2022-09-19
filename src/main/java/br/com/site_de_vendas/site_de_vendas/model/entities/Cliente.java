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
@Table(name = "clientes")
public class Cliente {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome_cliente", nullable = false, length = 120, unique = true)
	private String nome;
	
	@Column(name = "nome_fantasia", nullable = false, length = 120, unique = true)
	private String nomeFantasia;
	
	@Column(nullable = false, length = 18, unique = true)
	private String cnpj;
	
	@Column(name = "responsavel", nullable = false, length = 120)
	private String nomeResponsavel;
	
	@Column( nullable = false, length = 120)
	private String email;
	
	@Column(nullable = false, length = 30)
	private String telefone;
	
	@Column(nullable = false, length = 1)
	private int status;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Timestamp dtCadastro;

	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String nomeFantasia, String cnpj, String nomeResponsavel, String email,
			String telefone, int status) {
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.nomeResponsavel = nomeResponsavel;
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Timestamp dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
		
}
