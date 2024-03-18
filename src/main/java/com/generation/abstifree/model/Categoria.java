package com.generation.abstifree.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo nome categoria é obrigatório.")
	@Size(min = 5, max = 50, message = "O atributo nome deve conter no minimo 05 e no máximo 50 caracteres")
	private String nomeCategoria;

	@NotNull(message = "O atributo descrição é obrigatório.")
	@Size(min = 15, max = 150, message = "O atributo descrição deve conter no minimo 15 e no máximo 150 caracteres")
	private String descricaoCategoria;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_categoria() {
		return nomeCategoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nomeCategoria = nome_categoria;
	}

	public String getDescricao() {
		return descricaoCategoria;
	}

	public void setDescricao(String descricao) {
		this.descricaoCategoria = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	
}