package com.loiane.cursojava.diversos;

import java.util.Scanner;

public class SwitchCase{
	public static void main(String[] args){
		//switch-case --> funciona como mutiplos if-else

		//algoritmo que trabalha com dias da semana (1-7)
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um dia da semana (1-7)");
		int diaSemana = scan.nextInt();
		
		/*if(diaSemana == 1){
			System.out.println("Domingo");
		}else if(diaSemana == 2){
			System.out.println("Segunda");
		}else if(diaSemana == 3){
			System.out.println("Terca");
		}else if(diaSemana == 4){
			System.out.println("Quarta");
		}else if(diaSemana == 5){
			System.out.println("Quinta");
		}else if(diaSemana == 6){
			System.out.println("Sexta");
		}else if(diaSemana == 7){
			System.out.println("Sabado");
		}else{
			System.out.println("Dia da semana invalido!");
		}*/

		switch(diaSemana){
			case 1: 
				System.out.println("Domingo"); 
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terca");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Dia da semana invalido!");
		}

		System.out.println();
		System.out.println("Outra logica com dias da semana");

		System.out.println("Informe um dia da semana (1-7)");
		int dia = scan.nextInt();
		switch(dia){
			case 2: case 3: case 4: case 5: case 6:
				System.out.println("Dia util");
				break;
			case 1: case 7:
				System.out.println("Final de semana");
				break;
			default:
				System.out.println("Nao e um dia da semana valido!");
		}
	}
	
}

