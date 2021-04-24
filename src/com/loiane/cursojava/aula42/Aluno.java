package com.loiane.cursojava.aula42;

public class Aluno {

	private String curso;
	private String[] notas;
	private String endereco;

	public Aluno() {
		super();
	}

	public Aluno(String curso) {
		this.curso = curso;
	}

	public double calcularMedia() {
		return 0;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String obterEtiquetaEndereco() {
		StringBuilder sb = new StringBuilder();
		sb.append("Endereço do Aluno: ");
		sb.append(endereco);
		return sb.toString();
	}

	public void imprimirEtiquetaEndereco() {
		System.out.println("Aluno - Imprimindo dados");
		System.out.println(this.obterEtiquetaEndereco());
	}
}
