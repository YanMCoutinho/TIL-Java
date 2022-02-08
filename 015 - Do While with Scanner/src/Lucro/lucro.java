package Lucro;

import java.util.Scanner;

public class lucro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int custo, venda, lucro;
		String decisao;
		
		do {
			System.out.print("Digite o valor do custo do produto: ");
				custo = in.nextInt();
				
			System.out.print("Digite o valor de venda do produto: ");
				venda = in.nextInt();
				
			lucro = venda - custo;
				
			System.out.println("Seu lucro foi: " +lucro);
			
			System.out.println("Quer continuar? [SIM/NÃO] ");
				decisao = in.next();
				decisao=decisao.toUpperCase().substring(0,3);
		}
		while(!decisao.contentEquals("NÃO"));
		
	}

}
