package com.loiane.cursojava.aula42;
//as classes do tipo final não podem ser herdadas
public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telCelular;

	public Pessoa() {
		
	}

	public Pessoa(String nome, String endereco, String telfone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telfone;
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
		return telefone;
	}

	public void setTelfone(String telfone) {
		this.telefone = telfone;
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
	
	public void imprimirEtiquetaEndereco(){
		System.out.println(this.endereco);
	}
}
