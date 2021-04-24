package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {
	private static String resposta;
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int cont = 0;
		System.out.println("Perguntas de investigacao. Responda 'sim' ou 'nao'");
		System.out.println("Telefonou para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("sim")) {
			cont++;
		}
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("sim")){
			cont++;
		}
		if(cont == 2){
			System.out.println("Voce e SUSPEITO");
		}else if(cont > 2 && cont < 5){
			System.out.println("Voce e CUMPLICE");
		}else if(cont == 5){
			System.out.println("voce e o ASSASSINO");
		}else{
			System.out.println("Voce e INOCENTE");
		}
	}
}
