package com.loiane.cursojava.aula43.labs.exer03;

import java.util.Scanner;

public class Teste {
	private static Zoo zoo;
	private static Scanner scan;

	public static void main(String[] args) {
		zoo = new Zoo(6);
		scan = new Scanner(System.in);

		int opcao = -1;
		do {
			System.out.println("Banco True - Escolha uma opção:");
			System.out.println("1 - Adicionar Animal");
			System.out.println("2 - Remover Animal (pelo índice)");
			System.out.println("3 - Remover Animal (pelo índice)");
			System.out.println("4 - Imprimir Dados dos Animais");
			System.out.println("0 - Encerrar o programa");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Fim do programa.");
				break;
			case 1:
				adicionarAnimal();
				break;
			case 2:
				buscarAnimal();
				break;
			case 3:
				removerAnimal();
				break;
			case 4:
				System.out.println(imprimirDadosAnimais());
				break;
			}

		} while (opcao != 0);
	}

	public static void adicionarAnimal() {
		Animal animal = null;

		System.out.println("Informe o tipo de animal:");
		System.out.println("1 - Mamífero");
		System.out.println("2 - Peixe");

		int opcao = scan.nextInt();

		if (opcao == 1 || opcao == 2) {
			if (opcao == 1) {
				animal = new Mamifero();
			} else if (opcao == 2) {
				animal = new Peixe();
			}
			System.out.println("Informe o nome (espécie) do animal:");
			scan.nextLine();
			String nome = scan.nextLine();

			System.out.println("Informe o comprimento:");
			double comprimento = scan.nextDouble();

			if (animal instanceof Mamifero) {
				System.out.println("Informe a quantidade de patas:");
				int qtdPatas = scan.nextInt();
				animal.setPatas(qtdPatas);

				System.out.println("Informe o ambiente:");
				scan.nextLine();
				String ambiente = scan.nextLine();
				animal.setAmbiente(ambiente);

				System.out.println("Informe o alimento:");
				String alimento = scan.nextLine();
				((Mamifero) animal).setAlimento(alimento);
				

			} else if (animal instanceof Peixe) {
				System.out.println("Informe a(s) característica(s):");
				scan.nextLine();
				String caracteristicas = scan.nextLine();
				((Peixe) animal).setCaracteristica(caracteristicas);
			}
			
			System.out.println("Informe a cor:");
			String cor = scan.nextLine();

			System.out.println("Informe a velocidade:");
			double velocidade = scan.nextDouble();

			animal.setNome(nome);
			animal.setComprimento(comprimento);
			animal.setCor(cor);
			animal.setVelocidade(velocidade);

			try {
				zoo.adicionarAnimal(animal);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		} else {
			System.out.println("opção Inválida. Tente novamente.");
		}

	}

	public static void buscarAnimal() {
		System.out.println("Informe o índice do Animal:");
		int posicao = scan.nextInt();
		Animal animal = zoo.buscarAnimal(posicao);

		if (animal != null) {
			System.out.println("Animal encontrado");
			System.out.println("Nome:" + animal.getNome());
		} else
			System.out.println("Animal não encontrado");
	}

	public static void removerAnimal() {
		System.out.println("Informe o índice do Animal:");
		int posicao = scan.nextInt();

		boolean resultado = zoo.removerAnimal(posicao);
		if (resultado) {
			System.out.println("Animal de posicao " + posicao + " excluído");
		} else {
			System.out.println("Erro durante a operação de remoção");
		}
	}

	public static String imprimirDadosAnimais() {
		String dadosContribuintes = zoo.imprimirDadosAnimais();
		return dadosContribuintes;
	}

}
