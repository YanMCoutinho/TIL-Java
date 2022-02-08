package LicaoTpa8;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double area,larguraUm, larguraDois;
		
		System.out.print("Digite a largura de uma das paredes: ");
		larguraUm = sc.nextDouble();
		System.out.print("Digite a largura da parede adjacente a essa parede: ");
		larguraDois = sc.nextDouble();
		area=larguraUm*larguraDois;
		System.out.printf("A área dessa sala é de %.3f", area);
		sc.close();
	}

}
