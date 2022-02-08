package ExercicioRecup1;

import java.util.Scanner;

public class SEADICAO {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int num1, soma, num2;
		
		System.out.print("Digite o primeiro valor: ");
		num1=sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = sc.nextInt();
		soma=num1+num2;
		
		if (soma>=10) {
			soma=soma+5;
		} else {
			soma=soma-7;
		}
		System.out.printf("O resultado é de %d", soma);
		sc.close();
	}
		
}
