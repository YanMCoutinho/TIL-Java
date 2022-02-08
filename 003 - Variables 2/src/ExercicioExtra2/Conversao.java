package ExercicioExtra2;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double dolar, reais;
		
		System.out.print("Digite o valor em reais: ");
		reais = sc.nextDouble();
		dolar = reais/5.31;
		
		System.out.printf("R$%.2f é igual a U$%.2f", reais ,dolar);
		sc.close();

	}

}
