package com.loiane.cursojava.aula24.labs;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.gantiaMeses = 36;
		lampada.potencia = 7; // 7W
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";

		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";

		lampada.preco = 5.88;

		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Preço: " + lampada.preco);
		System.out.println("Tipos:");
		System.out.println(lampada.tipos[0]);
		System.out.println(lampada.tipos[1]);
	}
}
