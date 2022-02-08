package ExercicioProdutos;

import java.util.Scanner;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product produto01 = new Product("", 0, 0, 0);
		boolean valid = false;
		
		Locale.setDefault(Locale.GERMAN); //Java doesn't have pt_br locale, so I use locale.GERMAN to put comma on decimal numbers
		
		System.out.printf("Digite o nome do produto: ");
		produto01.setProductName(scan.nextLine());
		
		System.out.printf("%nDigite o custo do produto: ");
		produto01.setCostPrice(scan.nextDouble());
		
		System.out.printf("%nDigite o preço do produto: ");
		valid = produto01.setSalePrice(scan.nextDouble());
		
		do {
			System.out.printf("%nAtenção! O preço do produto deve ser maior que o preço de custo");
			System.out.printf("%nDigite o preço do produto: ");
			valid = produto01.setSalePrice(scan.nextDouble());
		} while(!valid);
		
		//Result's Prints
		System.out.printf("%nNome do produto: %s", produto01.getProductName());
		System.out.printf("%nCusto do produto: R$%.2f", produto01.getCostPrice());
		System.out.printf("%nPreço do produto: R$%.2f", produto01.getSalePrice());
		produto01.calcProfitMargin();
		System.out.printf("%nMargem de lucro do produto: R$%.2f", produto01.getProfitMargin());
		System.out.printf("%nMargem de lucro do produto em percentual: %.2f", produto01.getProfitMarginPercentage());
		System.out.print("%");
		
		scan.close();
	}

}
