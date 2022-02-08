package VelhoENovo;

import java.util.Scanner;

public class MaisVelhoENovo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int idade, nasc, anoAtual, maisVelho, maisNovo;
		
		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		System.out.print("Digite o ano de seu nascimento: ");
		nasc = sc.nextInt();
		
		idade = anoAtual - nasc;
		
		maisVelho = idade;
		maisNovo = idade;
		
		System.out.printf("%nA idade do mais velho é: " + maisVelho);
		System.out.printf("%nA idade do mais novo é: " + maisNovo + "%n%n");
		
		for (int cont = 1; cont <= 9; cont++) {
			System.out.print("Digite o ano atual: ");
			anoAtual = sc.nextInt();
			System.out.print("Digite o ano de seu nascimento: ");
			nasc = sc.nextInt();
			
			idade = anoAtual - nasc;
			
			if (maisVelho <= idade) {
				maisVelho = idade;
			} else if (maisNovo > idade) {
				maisNovo = idade;
			}
			System.out.printf("%nA idade do mais velho é: " + maisVelho);
			System.out.printf("%nA idade do mais novo é: " + maisNovo + "%n%n");
		}
	}

}
