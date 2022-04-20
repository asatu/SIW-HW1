package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private LocalDate dataInizio;

	@Column(nullable = false)
	private int durataInMesi;

	public Corso() {
	}

	public Corso(String nome, LocalDate data, int durata) {
		this.nome = nome;
		this.dataInizio = data;
		this.durataInMesi = durata;
	}

	@ManyToMany(mappedBy = "corso")
	private List<Allievo> allievo;

	@ManyToOne
	private Docente docente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurataInMesi() {
		return durataInMesi;
	}

	public void setDurataInMesi(int durataInMesi) {
		this.durataInMesi = durataInMesi;
	}

	public List<Allievo> getAllievo() {
		return allievo;
	}

	public void setAllievo(List<Allievo> allievo) {
		this.allievo = allievo;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
}
