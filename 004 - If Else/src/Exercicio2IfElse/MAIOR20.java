package Exercicio2IfElse;

import java.util.Scanner;

public class MAIOR20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double num1;
		
		System.out.print("Digite um n�mero: ");
		num1 = sc.nextDouble();
		
		if (num1>20) {
			System.out.printf("O n�mero %.2f � maior que 20", num1);
		} else {
			System.out.println("o n�mero digitado n�o � maior que 20");
		}
		
		sc.close();

	}

}
