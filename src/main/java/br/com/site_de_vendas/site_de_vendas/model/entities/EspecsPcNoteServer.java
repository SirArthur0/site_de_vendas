package br.com.site_de_vendas.site_de_vendas.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especs_pc_note_server")
public class EspecsPcNoteServer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 500)
	private String detalhes;

	@Column(nullable = false, length = 100)
	private String serie;

	@Column(nullable = false, length = 100)
	private String processador;

	@Column(nullable = false, length = 100)
	private String memoriaRam;

	@Column(nullable = false, length = 100)
	private String armazenamento;

	@Column(nullable = false, length = 50)
	private String os;

	
	public EspecsPcNoteServer() {
		
	}

	public EspecsPcNoteServer(String detalhes, String serie, String processador, String memoriaRam,
			String armazenamento, String os) {
		this.detalhes = detalhes;
		this.serie = serie;
		this.processador = processador;
		this.memoriaRam = memoriaRam;
		this.armazenamento = armazenamento;
		this.os = os;
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

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	
}
