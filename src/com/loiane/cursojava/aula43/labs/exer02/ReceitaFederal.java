package com.loiane.cursojava.aula43.labs.exer02;

public class ReceitaFederal {
	private Contribuinte[] contribuintes;
	private int tamanho;

	public ReceitaFederal() {
		this.tamanho = 0;
		this.contribuintes = new Contribuinte[10];
	}

	public ReceitaFederal(int qtdContribuintes) {
		this.tamanho = 0;
		this.contribuintes = new Contribuinte[qtdContribuintes];
	}

	public Contribuinte[] getContribuintes() {
		return contribuintes;
	}

	public void setContribuintes(Contribuinte[] contribuintes) {
		this.contribuintes = contribuintes;
	}

	public int getTamanho() {
		return tamanho;
	}

	/*public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}*/

	public void adicionarContribuinte(Contribuinte contribuinte) throws Exception {
		if (this.tamanho < this.contribuintes.length) {
			this.contribuintes[this.tamanho] = contribuinte;
			this.tamanho++;
		} else {
			throw new Exception("Agenda Cheia");
		}
	}

	public int buscarContribuinte(Contribuinte contribuinte) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.contribuintes[i].equals(contribuinte)) {
				return i;
			}
		}
		return -1;
	}

	public Contribuinte buscarContribuinte(int posicao) {
		if (isPosicaoValida(posicao)) {
			return this.contribuintes[posicao];
		} else {
			throw new IllegalArgumentException("Posição Inválida");
		}
	}

	public boolean removerContribuinte(int posicao) {
		if (isPosicaoValida(posicao)) {
			for (int i = posicao; i < this.tamanho - 1; i++) {
				this.contribuintes[i] = this.contribuintes[i + 1];
			}
			if (this.tamanho > 0) {
				this.contribuintes[this.tamanho - 1] = null;
				this.tamanho--;
				return true;
			}
		} else {
			throw new IllegalArgumentException("Posição inválida");
		}
		return false;
	}

	public boolean removerContribuinte(Contribuinte contribuinte) throws Exception {
		boolean resultado = false;
		int indice = buscarContribuinte(contribuinte);

		if (indice > -1) {
			resultado = removerContribuinte(indice);
		} else {
			throw new Exception("Contribuinte inexistente. Operação não pode ser realizada");
		}

		return resultado;
	}

	public boolean isPosicaoValida(int posicao) {
		return (posicao >= 0 && posicao < this.tamanho ? true : false);
	}

	public String imprimirDadosContribuintes() {
		StringBuilder sb = new StringBuilder();

		sb.append("Lista de Contribuintes");
		sb.append("\n");
		for (int i = 0; i < this.tamanho; i++) {
			sb.append("Contribuinte [");
			sb.append(this.contribuintes[i].toString());

			if (i < (this.tamanho - 1)) {
				sb.append("]");
				sb.append("\n");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}
}
