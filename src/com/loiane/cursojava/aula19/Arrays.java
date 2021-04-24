package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		double[] temps = new double[365];
		temps[0] = 31.3;
		temps[1] = 32;
		temps[2] = 33.7;
		temps[3] = 34;
		temps[4] = 33.1;
		
		System.out.println("Temperatura do dia 1 = " + temps[0]);
		System.out.println("Temperatura do dia 3 = " + temps[2]);
		
		System.out.println("Tamanho do Array = " + temps.length);
		
		System.out.println("Valores do Array = ");
		for (int i = 0; i < temps.length; i++) {
			System.out.println("Temperatura " + (i+1) + " : " + temps[i]);
		}
		
		System.out.println("Valores do Array(com for melhorado) = ");
		
		for(double elem : temps){
			System.out.println("Elemento: " + elem);
		}
	}
}
