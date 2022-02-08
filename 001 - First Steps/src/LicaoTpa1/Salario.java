package LicaoTpa1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, maxDivida;
		System.out.print("Digite o seu salário: ");
		salario=sc.nextDouble();
		maxDivida = 0.3 * salario;
		sc.close();
		System.out.printf("%nO máximo que você pode comprometer da sua renda com dívidas é equivalente a R$%.2f", maxDivida);

	}

}
