package com.loiane.cursojava.praticas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalarioFuncionario {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Programa calcular salario");
    System.out.println("Informe o salario base:");

    double salarioBase = scanner.nextDouble();
    String taxaPercentualAplicada = "";
    double valorPercentual = 0;
    double aumento = 0;
    double salarioFinal = 0;

    if (salarioBase <= 300) {
      taxaPercentualAplicada = "20%";
      valorPercentual = 0.2;

    } else if (salarioBase <= 700) {
      taxaPercentualAplicada = "15%";
      valorPercentual = 0.15;

    } else if (salarioBase <= 1800) {
      taxaPercentualAplicada = "10%";
      valorPercentual = 0.1;

    } else if (salarioBase > 1800) {
      taxaPercentualAplicada = "5%";
      valorPercentual = 0.05;
    }

    aumento = salarioBase * valorPercentual;
    salarioFinal = salarioBase + aumento;

    System.out.println("Resultados finais");
    System.out.println("Salario base " + salarioBase);
    System.out.println("Taxa percentual de aumento " + taxaPercentualAplicada);
    System.out.println("Aumento calculado: " + new DecimalFormat("0.00").format(aumento));
    System.out.println("Valor final salario: " + salarioFinal);
  }
}
