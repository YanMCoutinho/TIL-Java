package LicaoTpa7;

import java.util.Scanner;

public class CoelhosCusto {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numCoelho;
		double custo;
		
		System.out.print("Digite o número de coelhos: ");
		numCoelho=sc.nextInt();
		custo = (numCoelho * 0.70)/18 + 10;
		System.out.printf("O custo de seus coelhos é igual a R$ %.2f", custo);
		sc.close();

	}

}
