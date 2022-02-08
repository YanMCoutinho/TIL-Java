package Exercicio1;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double peso, altura, imc;
		
		System.out.print("Digite seu peso: ");
		peso=sc.nextDouble();
		System.out.print("Digite sua altura: ");
		altura=sc.nextDouble();
		imc=peso/(altura*altura);
		if (imc<18.5) {
			System.out.printf("Seu imc é de %.2f e você está em excesso de magreza", imc);
		} else if (imc>=18.5 && imc<=25) {
			System.out.printf("Seu imc é de %.2f e você está com seu peso normal", imc);
		} else if (imc>25 && imc<=30) {
			System.out.printf("Seu imc é de %.2f e você está em excesso de peso", imc);
		} else if (imc>30 && imc<=35) {
			System.out.printf("Seu imc é de %.2f e você está com obesidade grau 1", imc);
		} else if (imc>35 && imc<=40) {
			System.out.printf("Seu imc é de %.2f e você está com obesidade grau 2", imc);
		} else {
			System.out.printf("Seu imc é de %.2f e você está com obesidade grau 3", imc);
		}
		
		sc.close();

	}

}
