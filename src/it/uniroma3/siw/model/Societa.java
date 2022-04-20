package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private String ragioneSociale;

	@Column(nullable = false)
	private String via;

	@Column(nullable = false)
	private int numeroCivico;

	@Column(nullable = false)
	private int cap;

	@Column(length = 2)
	private String provincia;

	@Column(nullable = false)
	private int numeroTelefono;

	public Societa() {
	}

	public Societa(String nome, String via, int civico, int cap, String provincia, int telefono) {
		this.ragioneSociale = nome;
		this.via = via;
		this.numeroCivico = civico;
		this.cap = cap;
		this.provincia = provincia;
		this.numeroTelefono = telefono;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

}