package LicaoTpa1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, maxDivida;
		System.out.print("Digite o seu sal�rio: ");
		salario=sc.nextDouble();
		maxDivida = 0.3 * salario;
		sc.close();
		System.out.printf("%nO m�ximo que voc� pode comprometer da sua renda com d�vidas � equivalente a R$%.2f", maxDivida);

	}

}
