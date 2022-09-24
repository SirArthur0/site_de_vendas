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
@Table(name = "fabricantes")
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fabricante", length  = 50, nullable = false)
	private String nomeFabricante;
	
	@Column(length = 50, nullable = false)
	private String marca;
	
	@Column(length = 60, nullable = false)
	private String nomeResponsavel;
	
	@Column(length = 60, nullable = false)
	private String email;
	
	@Column(length = 30, nullable = false)
	private String telefone;
	
	@Column(nullable = false, length = 1)
	private char status = 1;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Timestamp dtCadastro;


	public Fabricante() {

	}

	public Fabricante(String nomeFabricante, String marca, String nomeResponsavel, String email, String telefone) {
		this.nomeFabricante = nomeFabricante;
		this.marca = marca;
		this.nomeResponsavel = nomeResponsavel;
		this.email = email;
		this.telefone = telefone;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
