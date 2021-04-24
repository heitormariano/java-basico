package com.loiane.cursojava.aula38;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telfone;
	private String cpf;
	private String telCelular;

	public Pessoa() {
		super(); // faz referência ao construtor da superclasse (no caso, Object)
	}

	public Pessoa(String nome, String endereco, String telfone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telfone = telfone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelfone() {
		return telfone;
	}

	public void setTelfone(String telfone) {
		this.telfone = telfone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
}
