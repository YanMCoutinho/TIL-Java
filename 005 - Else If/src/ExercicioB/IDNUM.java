package ExercicioB;

import java.util.Scanner;

public class IDNUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double num;
		
		System.out.print("Digite um n�mero: ");
		num = sc.nextDouble();
		if (num>0) {
			System.out.println("O n�mero digitado � positivo");
		} else if (num==0) {
			System.out.println("O n�mero digitado � neutro");
		} else {
			System.out.println("O n�mero digitado � negativo");
		}
		
		sc.close();
	}

}
