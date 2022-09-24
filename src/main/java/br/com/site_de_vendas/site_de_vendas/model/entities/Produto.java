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
import org.springframework.lang.Nullable;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome_produto", nullable = false, unique = true, length = 200)
	private String nomeProduto;

	@Column(nullable = false, length = 100)
	private String categoria;

	@Column(name = "valor_uni", nullable = false)
	private double valorUni;
	
	@Column(length = 1, nullable = false)
	private int status = 1;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Timestamp dtCadastro;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Fabricante fabricante;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Nullable
	private EspecsComponentes especsComponentes;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Nullable
	private EspecsPcNoteServer especsPcNotServer;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Nullable
	private EspecsLicencas especsLicencas;

	
	public Produto() {
		
	}

	public Produto(String nomeProduto, String categoria, double valorUni, Fabricante fabricante,
			EspecsComponentes especsComponentes, EspecsPcNoteServer especsPcNotServer, EspecsLicencas especsLicencas) {
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.valorUni = valorUni;
		this.fabricante = fabricante;
		this.especsComponentes = especsComponentes;
		this.especsPcNotServer = especsPcNotServer;
		this.especsLicencas = especsLicencas;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValorUni() {
		return valorUni;
	}

	public void setValorUni(double valorUni) {
		this.valorUni = valorUni;
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public EspecsComponentes getEspecsComponentes() {
		return especsComponentes;
	}

	public void setEspecsComponentes(EspecsComponentes especsComponentes) {
		this.especsComponentes = especsComponentes;
	}

	public EspecsPcNoteServer getEspecsPcNotServer() {
		return especsPcNotServer;
	}

	public void setEspecsPcNotServer(EspecsPcNoteServer especsPcNotServer) {
		this.especsPcNotServer = especsPcNotServer;
	}

	public EspecsLicencas getEspecsLicencas() {
		return especsLicencas;
	}

	public void setEspecsLicencas(EspecsLicencas especsLicencas) {
		this.especsLicencas = especsLicencas;
	}
		

}
