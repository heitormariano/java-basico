package com.loiane.cursojava.aula41;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;

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

	@Override
	public String obterEtiquetaEndereco() {
		StringBuilder sb = new StringBuilder();
		sb.append("Endereço do Professor: ");
		sb.append(super.getEndereco());
		return sb.toString();
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Professor - Imprimindo dados");
		System.out.println(this.obterEtiquetaEndereco());
	}
}
