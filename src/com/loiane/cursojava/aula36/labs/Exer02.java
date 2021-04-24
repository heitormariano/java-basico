package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {
	private static Curso curso;
	private static Scanner scan;

	public static void main(String[] args) throws Exception {
		curso = new Curso();
		scan = new Scanner(System.in);

		int opcao = -1;

		System.out.println("Exerc�cio 02");

		do {
			opcao = lerOpcoes(scan);

			switch (opcao) {
			case 0:
				System.out.println("Fim do programa.");
				break;
			case 1:
				definirNomeHorarioCurso();
				break;
			case 2:
				inserirProfessor();
				break;
			case 3:
				inserirAlunos();
				break;
			case 4:
				inserirNotasAlunos();
				break;
			case 5:
				obterMediaSituacaoAluno();
				break;
			case 6:
				obterMediaTurma();
				break;
			case 7:
				imprimirDadosCurso();
				break;
			default:
				System.out.println("Op��o inv�lida. Digite novamente.");
				System.out.println();
				break;
			}
		} while (opcao != 0);
	}
	
	public static int lerOpcoes(Scanner scan){
		System.out.println("Escolha uma das op��es:");
		System.out.println("1 - Informar nome e hor�rio do Curso");
		System.out.println("2 - Inserir professor");
		System.out.println("3 - Inserir alunos");
		System.out.println("4 - Inserir notas de alunos");
		System.out.println("5 - Obter m�dia e situa��o de alunos");
		System.out.println("6 - Obter M�dia da turma");
		System.out.println("7 - Imprimir dados b�sicos do Curso");
		System.out.println("0 - Sair");
		
		int opcao = scan.nextInt();
		return opcao;
	}
	
	public static void definirNomeHorarioCurso(){
		
		System.out.println("Digite o nome do Curso:");
		scan.nextLine();
		String nome = scan.nextLine();
		
		System.out.println("Digite o Hor�rio do Curso:");
		String horario = scan.nextLine();
		
		curso.setNome(nome);
		curso.setHorario(horario);
		
		System.out.println();
	}
	
	public static void inserirProfessor(){
		Professor professor = new Professor();

		System.out.println("Informe os seguintes dados para o professor:");

		System.out.println("Nome:");
		scan.nextLine();
		String nomeProf = scan.nextLine();

		System.out.println("Departamento:");
		String depProf = scan.nextLine();

		System.out.println("Email:");
		String emailProf = scan.nextLine();

		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);

		curso.setProfessor(professor);
		System.out.println();
	}
	
	
	public static void inserirAlunos(){
		int opAlunos = -1;
		do {
			System.out.println("Inclus�o de Alunos - escolha uma entre as op��es a seguir:");

			System.out.println("1 - Informar dados de um aluno");
			System.out.println("2 - finalizar");

			opAlunos = scan.nextInt();

			if (opAlunos == 1) {
				System.out.println("Dados de um aluno");

				System.out.println("Nome:");
				scan.nextLine();
				String nomeAluno = scan.nextLine();

				System.out.println("Matr�cula:");
				String matAluno = scan.nextLine();

				Aluno aluno = new Aluno();
				aluno.setNome(nomeAluno);
				aluno.setMatricula(matAluno);

				curso.adicionarAluno(aluno);

			} else if (opAlunos == 2) {
				System.out.println("Fim da inclus�o de alunos");
			} else {
				System.out.println("Op��o inv�lida. Digite novamente.");
			}

		} while (opAlunos != 2);
		System.out.println();
	}
	
	public static void inserirNotasAlunos() throws Exception{
		// Inclus�o direta de notas
		// Outra forma de implementa��o: a classe Aluno pode se comportar como uma lista de notas
		
		Aluno aluno;
		double[] notas;

		for (int i = 0; i < curso.tamanhoTurma(); i++) {
			aluno = curso.buscarAluno(i);
			notas = new double[4];

			System.out.println("Aluno " + (i + 1) + " (" + aluno.getNome() + ")");
			for (int j = 0; j < aluno.getNotas().length; j++) {
				System.out.println("Informe a nota " + (j + 1));
				double nota = scan.nextDouble();
				notas[j] = nota;
			}
			aluno.setNotas(notas);
		}
		System.out.println();
	}
	
	public static void obterMediaSituacaoAluno() throws Exception{
		System.out.println("Informe �ndice do aluno desejado:");

		int indice = scan.nextInt();
		Aluno alunoBusca = curso.buscarAluno(indice);

		if (alunoBusca != null) {
			System.out.println("Aluno encontrado!");
			System.out.println("Nome: " + alunoBusca.getNome());
			System.out.println("Matr�cula: " + alunoBusca.getMatricula());
			System.out.println("M�dia: " + alunoBusca.mediaNotas());
			System.out.println("Resultado final: " + (alunoBusca.isAprovado() ? "Aprovado" : "Reprovado"));
		} else {
			System.out.println("Aluno n�o encontrado para o �ndice fornecido");
		}
		System.out.println();
	}
	
	public static void obterMediaTurma() {
		if (curso.tamanhoTurma() == 0) {
			System.out.println("O curso est� sem alunos. Fa�a o cadastro deles.");
		}
		System.out.println("M�dia geral da turma: " + curso.mediaTurma());
		System.out.println();
	}
	
	public static void imprimirDadosCurso(){
		String nomeCurso, profCurso, horarioCurso;
		int tamanhoTurma;

		System.out.println("Informa��es do curso");

		if (curso.getNome() != null && !curso.getNome().isEmpty()) {
			nomeCurso = curso.getNome();
		} else {
			nomeCurso = "N�o informado";
		}
		
		if(curso.getHorario() != null && !curso.getHorario().isEmpty()){
			horarioCurso = curso.getHorario();
		}else{
			horarioCurso = "N�o informado";
		}

		if (curso.getProfessor() != null) {
			if (curso.getProfessor().getNome() != null && !curso.getProfessor().getNome().isEmpty()) {
				profCurso = curso.getProfessor().getNome();
			} else {
				profCurso = "N�o informado";
			}
		} else {
			profCurso = "N�o informado";
		}

		if (curso.tamanhoTurma() > 0) {
			tamanhoTurma = curso.tamanhoTurma();
		} else {
			tamanhoTurma = 0;
		}

		System.out.println("Nome Curso: " + nomeCurso);
		System.out.println("Hor�rio do Curso: " + horarioCurso);
		System.out.println("Professor: " + profCurso);
		System.out.println("Quantidade de alunos: " + tamanhoTurma);
		System.out.println();
	}
}
