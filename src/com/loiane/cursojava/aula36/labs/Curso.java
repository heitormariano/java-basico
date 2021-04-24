package com.loiane.cursojava.aula36.labs;

public class Curso {
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	private int qtdAlunos; // tamanho da turma

	public Curso() {
		this.qtdAlunos = 0;
		this.alunos = new Aluno[10];
	}

	public boolean adicionarAluno(Aluno aluno) {
		this.aumentaCapacidade();

		this.alunos[this.qtdAlunos] = aluno;
		this.qtdAlunos++;
		return true;
	}
	
	public Aluno buscarAluno(int posicao) throws Exception {
		if (!(isPosicaoValida(posicao))) {
			throw new IllegalArgumentException("Posicação Inválida");
		}
		return this.alunos[posicao];
	}

	public void removerAlunos(int indice) throws Exception {
		if (!(isPosicaoValida(indice))) {
			throw new Exception("Índice inválido");
		}

		for (int i = indice; i < this.qtdAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}

		if (this.qtdAlunos > 0) {
			this.alunos[this.qtdAlunos - 1] = null;
		}
		this.qtdAlunos--;

	}

	private void aumentaCapacidade() {
		if (this.qtdAlunos == this.alunos.length) {
			Aluno[] alunosNovos = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				alunosNovos[i] = this.alunos[i];
			}
			this.alunos = alunosNovos;
		}
	}

	private boolean isPosicaoValida(int indice) {
		if (indice >= 0 && indice < this.qtdAlunos) {
			return true;
		}
		return false;
	}

	public double mediaTurma() {
		int qtdAlunos = this.alunos.length;
		double somaMediaAlunos = 0;
		double mediaTurma = 0;

		if (this.qtdAlunos == 0) {
			return mediaTurma;
		}
		for (int i = 0; i < qtdAlunos; i++) {
			somaMediaAlunos += this.alunos[i].mediaNotas();
		}
		mediaTurma = somaMediaAlunos / qtdAlunos;
		return mediaTurma;
	}
	
	public int tamanhoTurma(){
		return this.qtdAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

}
