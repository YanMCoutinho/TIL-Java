package ExercicioFatorial;

import java.util.Scanner;

public class FatorialInteiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int fatorial = 1;
		int num, aux;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		aux = num;
		
		System.out.println("O fatorial do número escolhido é igual a: ");
		System.out.print("!" + num + " = ");
		
		while (aux > 0) {
			
			if (aux == 1) {
				System.out.print(aux);	
			} else {
				System.out.print(aux + " * ");
			}
			fatorial = fatorial * aux;
		
			aux--;
		}
		
		System.out.print(" = " + fatorial);
		sc.close();
	}

}
