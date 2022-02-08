package primeNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtyNum;
		int numSingle;
		int numArray[];

		System.out.print("Digite um n�mero para saber se ele � primo: ");
		numSingle = scan.nextInt();

		PrimeNumbers.printIsPrimeNumber(PrimeNumbers.isPrimeNumber(numSingle), numSingle);

		System.out.printf("%n%nQuantos n�meros voc� quer conferir se primo? ");
		qtyNum = scan.nextInt();
		numArray = new int[qtyNum];

		for (int count = 0; count < qtyNum; count++) {
			System.out.printf("%nDigite o " + (count+1) +"th n�mero: ");
			numArray[count] = scan.nextInt();
		}

		PrimeNumbers.printIsPrimeNumber(PrimeNumbers.isPrimeNumber(numArray), numArray);

		scan.close();
	}

}
