package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Informe o ano: ");
	int ano = scan.nextInt();

		if(ano % 400 == 0){
			System.out.println("O ano " + ano + " e bissexto!");
		} else if((ano % 4 == 0) && (ano % 100 != 0) ){
			System.out.println("O ano " + ano + " e bissexto!");
		}else{
			System.out.println("O ano " + ano + " NAO e bissexto!");
		}
	}
}