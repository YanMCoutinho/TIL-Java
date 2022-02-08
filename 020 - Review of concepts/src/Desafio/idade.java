package Desafio;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoNasc, anoAtual, idade;
        String resp = "SIM";
        
        while (!resp.toLowerCase().equals("não")) {
            System.out.printf("%nDigite seu ano de nascimento: ");
            anoNasc = scan.nextInt();

            System.out.printf("Digite o ano atual: ");
            anoAtual = scan.nextInt();

            idade = anoAtual - anoNasc;

            System.out.printf("A idade dessa pessoa é de %d anos ", idade);
            
            System.out.printf("%n%nQuer continuar? ");
            resp = scan.next();
        } 
        
        scan.close();
	}

}
