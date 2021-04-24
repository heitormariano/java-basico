package com.loiane.cursojava.aula39;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;

	public Professor() {

	}

	public double calcularSalarioLiquido() {
		return 0;
	}

	public void mmetodoSimples() {
		super.metodoProtected();
		super.metodoDefault();

		// this.metodoProtected();
		// this.metodoDefault();
	}

	public void metodoSimplesDois(){
		this.atributoDefault = "valor qualquer";
		this.atributoProtected = "Novo valor";
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

}
