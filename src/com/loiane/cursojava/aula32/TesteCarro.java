package com.loiane.cursojava.aula32;

public class TesteCarro {
	public static void main(String[] args) {
		Carro carro = new Carro();

		carro.setMarca("Fiat");
		carro.setModelo("Ducato");
		carro.setNumPassageiros(6);

		System.out.println("Marca:" + carro.getMarca());
		System.out.println("Modelo:" + carro.getModelo());
		System.out.println("Quantidade de passageiros:" + carro.getNumPassageiros());
	}
}
