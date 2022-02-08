package LicaoTpa6;

import java.util.Scanner;

public class TemperaturaC {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double F,C;
		
		System.out.print("Digite aqui a temperatura em Fahrenheit: ");
		F = sc.nextDouble();
		C = ((F-32)*5)/9;
		System.out.printf("Essa temperatura em Celsius é igual a %.2f°", C);
		sc.close();

	}

}
