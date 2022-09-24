package br.com.site_de_vendas.site_de_vendas.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especs_componentes")
public class EspecsComponentes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "detalhes_componente", nullable = false, length = 500)
	private String detalhes;
	
	@Column(nullable = true, length = 500)
	private String especificacao;

	@Column(nullable = true, length = 100)
	private String serie;

	
	public EspecsComponentes() {
		
	}
	
	public EspecsComponentes(String detalhes, String especificacao, String serie) {
		this.detalhes = detalhes;
		this.especificacao = especificacao;
		this.serie = serie;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
		
}
