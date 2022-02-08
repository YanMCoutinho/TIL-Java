package LicaoTpa3;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite o valor das notas: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		nota4 = sc.nextDouble();
		sc.close();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("%nA média das notas desse aluno é de %.1f",media);

	}

}
