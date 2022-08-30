package com.produtos.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Gerente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long gerenteID;
	
	private String nomeGerente;
	
	private String emailGerente;

	public long getGerenteID() {
		return gerenteID;
	}

	public void setGerenteID(long gerenteID) {
		this.gerenteID = gerenteID;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}

	public String getEmailGerente() {
		return emailGerente;
	}

	public void setEmailGerente(String emailGerente) {
		this.emailGerente = emailGerente;
	}

}
