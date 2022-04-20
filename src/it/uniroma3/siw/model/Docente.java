package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String cognome;

	@Column(nullable = false)
	private LocalDate dataDiNascita;

	@Column(nullable = false)
	private String luogoDiNascita;

	@Column(nullable = false)
	private int partitaIva;

	public Docente() {
	}

	public Docente(Long id, String nome, String cognome, LocalDate data, String luogo, int iva) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = data;
		this.partitaIva = iva;
	}

	@OneToMany (mappedBy = "docente", cascade = {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.MERGE})
	private List<Corso> corso;


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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public int getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(int partitaIva) {
		this.partitaIva = partitaIva;
	}

	public List<Corso> getCorso() {
		return corso;
	}

	public void setCorso(List<Corso> corso) {
		this.corso = corso;
	}
	
}
