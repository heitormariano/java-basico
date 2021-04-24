package com.loiane.cursojava.aula36;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;

	public Contato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndeco() {
		return endereco;
	}

	public void setEndeco(Endereco endeco) {
		this.endereco = endeco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

}
