package ExercicioC;

import java.util.Scanner;

public class CONVERSORFAHR {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double F,C;
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		F = sc.nextDouble();
		C = ((F-32)*5)/9;
		System.out.printf("Essa temperatura em Celsius é de %.2f e está ", C);
		if (C<15) {
			System.out.print("frio");
		} else if (C>=22) {
			System.out.println("calor");
		}else {
			System.out.println("ameno");
		}
		sc.close();
	}

}
