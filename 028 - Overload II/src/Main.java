import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EvenOrOdd test = new EvenOrOdd();
		int qtyNum;
		int numSingle;
		int numArray[];

		System.out.print("Digite um n�mero para saber se � para ou impar: ");
		numSingle = scan.nextInt();

		test.printIsEven(test.isEven(numSingle), numSingle);

		System.out.printf("%n%nQuantos n�meros voc� quer conferir se � par ou impar? ");
		qtyNum = scan.nextInt();
		numArray = new int[qtyNum];

		for (int count = 0; count < qtyNum; count++) {
			System.out.printf("%nDigite um n�mero: ");
			numArray[count] = scan.nextInt();
		}

		test.printIsEven(test.isEven(numArray), numArray);

		scan.close();
	}

}
