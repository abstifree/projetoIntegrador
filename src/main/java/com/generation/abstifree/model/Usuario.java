package com.generation.abstifree.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no minimo 05 e no maximo 100 caracteres")
	private String nomeUsuario;
	
	@NotBlank(message = "O atributo login é Obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo login deve conter no minimo 05 e no maximo 50 caracteres")
	private String loginUsuario;
	
	@NotBlank(message = "O atributo senha é Obrigatório!")
	@Size(min = 6, max = 15, message = "O atributo login deve conter no minimo 06 e no maximo 15 caracteres")
	private String senhaUsuario;
	
	@NotBlank(message = "O atributo foto é Obrigatório!")
	@Lob
	private byte[] fotoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public byte[] getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(byte[] fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}
	
	
}
