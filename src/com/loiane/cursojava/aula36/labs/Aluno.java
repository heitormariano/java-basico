package com.loiane.cursojava.aula36.labs;

import java.util.Arrays;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;

	public Aluno() {
		this.notas = new double[4];
	}

	public double mediaNotas() {
		int qtdNotas = this.notas.length;
		double somaNotas = 0;
		double media = 0;

		for (int i = 0; i < qtdNotas; i++) {
			somaNotas += this.notas[i];
		}

		media = somaNotas / qtdNotas;
		return media;
	}

	public boolean isAprovado() {
		double media = this.mediaNotas();

		if (media >= 7.0) {
			return true;
		} else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(notas);
		return result;
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
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + "]";
	}
}
