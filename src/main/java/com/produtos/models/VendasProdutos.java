package com.produtos.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class VendasProdutos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vandasId;
	
	private String quantidadeVendas;
	
	@ManyToOne
	private Usuarios usuarios;
	
	@ManyToOne
	@JoinColumn(name="produtos_id")
	private Produtos produtos;
	

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Produtos getProduto() {
		return produtos;
	}

	public void setProduto(Produtos produtos) {
		this.produtos = produtos;
	}

	public long getVandasId() {
		return vandasId;
	}

	public void setVandasId(long vandasId) {
		this.vandasId = vandasId;
	}

	public String getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(String quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
	
	

}
