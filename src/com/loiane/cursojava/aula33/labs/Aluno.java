package com.loiane.cursojava.aula33.labs;

public class Aluno {

	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] disciplinas;
	private double[][] notaDisciplinas;

	public Aluno() {
		this.disciplinas = new String[3];
		this.notaDisciplinas = new double[3][4];
	}

	public Aluno(String nome, String matricula, String nomeCurso, String[] disciplinas, double[][] notaDisciplinas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.disciplinas = disciplinas;
		this.notaDisciplinas = notaDisciplinas;
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

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotaDisciplinas() {
		return notaDisciplinas;
	}

	public void setNotaDisciplinas(double[][] notaDisciplinas) {
		this.notaDisciplinas = notaDisciplinas;
	}

	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do Curso: " + nomeCurso);

		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print("Notas da disciplina " + disciplinas[i] + " : ");
			for (int j = 0; j < notaDisciplinas[i].length; j++) {
				System.out.print(notaDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean verificarAprovado(int indice) {
		double media = 0;
		media = obterMedia(indice);

		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	public double obterMedia(int indice) {
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < notaDisciplinas[indice].length; i++) {
			soma += notaDisciplinas[indice][i];
		}
		
		media = soma / notaDisciplinas[indice].length;
		return media;
	}
	
	public void setNomeDisciplinaPos(int posicao, String nomeDisciplina){
		this.disciplinas[posicao] = nomeDisciplina;
	}
	
	public void setNotaDisciplinaPos(int posDisciplina, int posNota, double nota){
		this.notaDisciplinas[posDisciplina][posNota] = nota;
	}
}
