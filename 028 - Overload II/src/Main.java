import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EvenOrOdd test = new EvenOrOdd();
		int qtyNum;
		int numSingle;
		int numArray[];

		System.out.print("Digite um número para saber se é para ou impar: ");
		numSingle = scan.nextInt();

		test.printIsEven(test.isEven(numSingle), numSingle);

		System.out.printf("%n%nQuantos números você quer conferir se é par ou impar? ");
		qtyNum = scan.nextInt();
		numArray = new int[qtyNum];

		for (int count = 0; count < qtyNum; count++) {
			System.out.printf("%nDigite um número: ");
			numArray[count] = scan.nextInt();
		}

		test.printIsEven(test.isEven(numArray), numArray);

		scan.close();
	}

}
