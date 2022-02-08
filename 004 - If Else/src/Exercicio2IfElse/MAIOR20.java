package Exercicio2IfElse;

import java.util.Scanner;

public class MAIOR20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double num1;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextDouble();
		
		if (num1>20) {
			System.out.printf("O número %.2f é maior que 20", num1);
		} else {
			System.out.println("o número digitado não é maior que 20");
		}
		
		sc.close();

	}

}
