package ExercicioA;

import java.util.Scanner;

public class SALARIOMIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double salario;
		
		System.out.print("Digite seu sal�rio: ");
		salario = sc.nextDouble();
		if (salario>954.00) {
			System.out.print("O sal�rio digitado est� acima do sal�rio m�nimo");
		} else {
			System.out.print("O sal�rio digitado est� abaixo do sal�rio m�nimo");
		}
		sc.close();
	}

}
