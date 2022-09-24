package br.com.site_de_vendas.site_de_vendas.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especs_licencas")
public class EspecsLicencas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "detalhes_licencas", nullable = false, length = 500)
	private String detalhes;

	@Column(nullable = true, length = 100)
	private String serie;

	
	public EspecsLicencas() {
	
	}

	public EspecsLicencas(String detalhes, String serie) {
		this.detalhes = detalhes;
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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
		
	
}
