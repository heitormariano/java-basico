package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14{
	public static void main(String[] args){
		
		//o exercício não considerou que a velocidade de um link de internet é em Mbps (MegaBits por segundo é diferente de MegaBytes por segundo).
		//A resposta do curso foi apenas calculo direto (tamanhoArquivo / velocidadeLink).
		Scanner scan = new Scanner(System.in);

		System.out.println("Calculo de tempo de Download de arquivos");
		System.out.println("Informe o tamanho do arquivo (MB)");
		double tamArqMegaBytes = scan.nextDouble();
		
		System.out.println("Informe a velocidade do link de internet (Mbps)");
		double velocidadeLink = scan.nextDouble();

		double tamArqMegaBits  = tamArqMegaBytes * 8;

		double tempoSegundos = tamArqMegaBits/velocidadeLink;
		double tempoMinutos = tempoSegundos/60;

		System.out.println("Tempo estimado (em minutos) para conclusao do download " + tempoMinutos);

	}
}