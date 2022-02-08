package LicaoTpa2;

import java.util.Scanner;

public class IdadeNome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome=sc.nextLine();
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.printf("%s, você tem %d anos.", nome,idade);
		sc.close();
	}
}
