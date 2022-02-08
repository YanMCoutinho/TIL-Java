package LicaoTpa4;

import java.util.Scanner;

public class SalarioLiq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioBruto, salarioLiq, inss, valorAula;
		int aulaDada;
		
		System.out.print("Digite o valor de suas aulas: ");
		valorAula = sc.nextDouble();
		System.out.print("Digite a quantidade de aulas dadas: ");
		aulaDada = sc.nextInt();
		System.out.print("Digite a porcentagem de seu INSS: ");
		inss= sc.nextDouble();
		salarioBruto = (double) valorAula*aulaDada;
		salarioLiq= salarioBruto - ((inss/100)*salarioBruto);
		System.out.printf("O seu salário líquido será de R$%.2f", salarioLiq);
		sc.close();
	}

}
