package com.loiane.cursojava.aula45;

public class Aluno extends Pessoa {

	private String curso;
	private String[] notas;

	public Aluno() {
		super(); // faz referência, "chama" o construttor da superclasse (Pessoa)
					
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

	@Override
	public String obterEtiquetaEndereco() {
		StringBuilder sb = new StringBuilder();
		sb.append("Endereço do Aluno: ");
		sb.append(super.getEndereco());
		return sb.toString();
	}
}
