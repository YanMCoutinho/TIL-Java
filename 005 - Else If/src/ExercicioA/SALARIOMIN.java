package ExercicioA;

import java.util.Scanner;

public class SALARIOMIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double salario;
		
		System.out.print("Digite seu salário: ");
		salario = sc.nextDouble();
		if (salario>954.00) {
			System.out.print("O salário digitado está acima do salário mínimo");
		} else {
			System.out.print("O salário digitado está abaixo do salário mínimo");
		}
		sc.close();
	}

}
