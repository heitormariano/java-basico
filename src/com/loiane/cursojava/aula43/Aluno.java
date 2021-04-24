package com.loiane.cursojava.aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;
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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sbNotas = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < notas.length; i++) {
			if (i < notas.length - 1) {
				sbNotas.append(notas[i] + " , ");
			} else // (i == notas.length -1)
				sbNotas.append(notas[i]);
		}
		sb.append("Curso: " + curso + " - Endereço: " + endereco + " - Notas: " + sbNotas.toString());
		sb.append("]");
		return sb.toString();
	}
}
