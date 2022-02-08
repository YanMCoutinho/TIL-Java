package ExercicioDeSomar;

import java.util.Scanner;

public class SomaInfinita {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int soma = 0;
		int num;
		String escolha = "S";
		
		while (escolha.equals("S")) {
			
			System.out.println("Digite um número");
			num = sc.nextInt();			
			
			System.out.println("Quer continuar? [S / N]");
			escolha = sc.next();
			
			escolha=escolha.toUpperCase().substring(0,1);
			
			soma += num;
		}
		System.out.println("A soma de todos os valores é " + soma);
		
		sc.close();

	}

}
