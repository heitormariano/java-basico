package com.loiane.cursojava.aula42;

public class Professor {
	private String departamento;
	private String nomeCurso;
	private double salario;
	private String endereco;

	public Professor() {

	}

	public double calcularSalarioLiquido() {
		return 0;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String obterEtiquetaEndereco() {
		StringBuilder sb = new StringBuilder();
		sb.append("Endereço do Professor: ");
		sb.append(endereco);
		return sb.toString();
	}

	public void imprimirEtiquetaEndereco() {
		System.out.println("Professor - Imprimindo dados");
		System.out.println(this.obterEtiquetaEndereco());
	}
}
