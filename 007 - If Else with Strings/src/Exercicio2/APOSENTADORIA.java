package Exercicio2;

import java.util.Scanner;

public class APOSENTADORIA {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int aposentadoria, idade, anoNasc;
		String sexo;
		String fem="F";
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNasc= sc.nextInt();
		System.out.print("Digite o seu sexo (M ou F): ");
		sexo=sc.next();
		
		idade=2020-anoNasc;
		sexo=sexo.toUpperCase().substring(0,1);
		
		if (sexo.equals(fem)) {
			aposentadoria=60-idade;
		} else {
			aposentadoria=65-idade;
			
		}System.out.print("Você se aposentará em "+ aposentadoria + " anos");
			
		sc.close();
		
	}

}
