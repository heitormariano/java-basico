package com.loiane.cursojava.aula39.externo;

import com.loiane.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa {

	private String curso;
	private String[] notas;

	public Aluno() {

	}

	public Aluno(String nome, String endereco, String telfone, String curso) {
		super(nome, endereco, telfone);
		this.curso = curso;
	}

	public void metodoQualquer() {
		super.setNome("Nome Qualquer");
		this.setNome("Testando");

		super.setCpf("056.567.345-67");
		this.setCpf("123.456.678-10");
	}

	public void metodoVisibilidade() {
		this.metodoProtected();
		// this.metodoDefault;
	}

	public void metodoVisibilidadeDois() {
		// this.atributoDefault = "valor qualquer";
		this.atributoProtected = "Valor qualquer";
	}

	public double calcularMedia() {
		return 0;
	}

	public void metodoSimples() {
		super.metodoProtected();
	}

	public void metodoSimplesDois() {
		// método default não pod ser acessado. A classe aluno está em um pacote
		// diferente
		// super.metodoDefault();
	}

	public boolean verificarAprovado() {
		return false;
	}

	public String getCursos() {
		return curso;
	}

	public void setCursos(String curso) {
		this.curso = curso;
	}

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}
}
