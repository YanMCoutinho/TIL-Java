package Exercicio1IfElse;

import java.util.Scanner;

public class MAIOR {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double num1,num2;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextDouble();
		
		if (num1>num2) {
			System.out.printf("O numero %.2f � o maior", num1);
		} else {
			System.out.printf("O numero %.2f � o maior", num2);
		}
		
		sc.close();

	}

}
 