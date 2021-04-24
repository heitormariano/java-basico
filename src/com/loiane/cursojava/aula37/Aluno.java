package com.loiane.cursojava.aula37;

public class Aluno extends Pessoa {

	private String curso;
	private String[] notas;

	public Aluno() {

	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return false;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}
}
