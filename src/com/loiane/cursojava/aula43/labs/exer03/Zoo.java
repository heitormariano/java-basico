package com.loiane.cursojava.aula43.labs.exer03;

public class Zoo {
	private Animal[] animais;
	private int tamanho;

	public Zoo() {
		this.tamanho = 0;
		this.animais = new Animal[10];
	}

	public Zoo(int qtdAnimais) {
		this.tamanho = 0;
		this.animais = new Animal[qtdAnimais];
	}

	Animal[] getAnimais() {
		return animais;
	}

	void setAnimais(Animal[] animais) {
		this.animais = animais;
	}

	int getTamanho() {
		return tamanho;
	}

	void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void adicionarAnimal(Animal animal) throws Exception {
		if (this.tamanho < this.animais.length) {
			this.animais[this.tamanho] = animal;
			this.tamanho++;
		} else {
			throw new Exception("Zoo cheio");
		}
	}

	public int buscarAnimal(Animal animal) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.animais[i].equals(animal)) {
				return i;
			}
		}
		return -1;
	}

	public Animal buscarAnimal(int posicao) {
		if (isPosicaoValida(posicao)) {
			return this.animais[posicao];
		} else {
			throw new IllegalArgumentException("Posição Inválida");
		}
	}

	public boolean removerAnimal(int posicao) {
		if (isPosicaoValida(posicao)) {
			for (int i = posicao; i < this.tamanho - 1; i++) {
				this.animais[i] = this.animais[i + 1];
			}
			if (this.tamanho > 0) {
				this.animais[this.tamanho - 1] = null;
				this.tamanho--;
				return true;
			}
		} else {
			throw new IllegalArgumentException("Posição inválida");
		}
		return false;
	}

	public boolean removerAnimal(Animal animal) throws Exception {
		boolean resultado = false;
		int indice = buscarAnimal(animal);

		if (indice > -1) {
			resultado = removerAnimal(indice);
		} else {
			throw new Exception("Animal não cadastrado. Operação não pode ser realizada");
		}

		return resultado;
	}

	public boolean isPosicaoValida(int posicao) {
		return (posicao >= 0 && posicao < this.tamanho ? true : false);
	}

	public String imprimirDadosAnimais() {

		StringBuilder sb = new StringBuilder();
		sb.append("Zoo\n");
		sb.append("------------------------------------\n");
		for (int i = 0; i < this.tamanho; i++) {
			sb.append(this.animais[i]);
			sb.append("------------------------------------\n");
		}
		return sb.toString();
	}

}
