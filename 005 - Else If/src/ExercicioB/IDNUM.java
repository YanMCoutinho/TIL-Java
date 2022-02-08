package ExercicioB;

import java.util.Scanner;

public class IDNUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double num;
		
		System.out.print("Digite um número: ");
		num = sc.nextDouble();
		if (num>0) {
			System.out.println("O número digitado é positivo");
		} else if (num==0) {
			System.out.println("O número digitado é neutro");
		} else {
			System.out.println("O número digitado é negativo");
		}
		
		sc.close();
	}

}
