package ExercicioExtra1;

import java.util.Scanner;

public class AntesDepois {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double numero, antecessor, sucessor;
		
		System.out.print("Digite o n�mero desejado: ");
		numero = sc.nextDouble();
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.print("O antecessor desse n�mero � " + antecessor + " e o sucessor � "  + sucessor);
		sc.close();

	}

}
