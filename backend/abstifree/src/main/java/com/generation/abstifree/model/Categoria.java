package com.generation.abstifree.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Categoria {

	@Entity
	@Table(name = "tb_categorias")
	public class Theme {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotNull(message = "O atributo nome_categoria é obrigatório.")
		@Size(min = 5, max = 50, message = "O atributo nome deve conter no minimo 05 e no máximo 50 caracteres")
		private String nome_categoria;

		@NotNull(message = "O atributo descrição é obrigatório.")
		@Size(min = 15, max = 150, message = "O atributo descrição deve conter no minimo 15 e no máximo 1000 caracteres")
		private String descricao;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome_categoria() {
			return nome_categoria;
		}

		public void setNome_categoria(String nome_categoria) {
			this.nome_categoria = nome_categoria;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

	}
}