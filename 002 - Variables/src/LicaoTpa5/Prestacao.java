package LicaoTpa5;

import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double valor,prestacao,taxa;
		int tempo;
		
		System.out.print("Digite o valor da presta��o, sem incluir os juros: ");
		valor =  sc.nextDouble();
		System.out.print("DIgite o valor dos juros da presta��o: ");
		taxa = sc.nextDouble();
		System.out.print("Digite o tempo de atraso da presta��o: ");
		tempo = sc.nextInt();
		prestacao = valor + (valor * (taxa/100)*tempo);
		System.out.printf("O valor da presta��o acrescido de juros � de R$%.2f",prestacao);
		sc.close();
	}

}
