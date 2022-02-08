package primeNumbers;

public class PrimeNumbers {

	// Constructor Method
	public PrimeNumbers() {
	}

	// EvenOrOdd Unique Methods
	public static boolean isPrimeNumber(int num) {
		if (num>1) {
			for(int cont = 2; cont<num; cont++) {
				if (num % cont == 0 && num != 2) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public static boolean[] isPrimeNumber(int[] num) {
		boolean[] listIsEven = new boolean[num.length];
		
		for (int column = 0; column < num.length; column++) {
			listIsEven[column] = isPrimeNumber(num[column]);
		}
		return listIsEven;
	}

	public static void printIsPrimeNumber(boolean answerIsPrimeNumber, int num) {
		if (answerIsPrimeNumber) {
			System.out.printf("%nO número %d é primo", num);
		} else {
			System.out.printf("%nO número %d não é primo", num);
		}
	}

	public static void printIsPrimeNumber(boolean[] answerIsPrimeNumber, int[] num) {
		for (int column = 0; column < answerIsPrimeNumber.length; column++) {
			printIsPrimeNumber(answerIsPrimeNumber[column], num[column]);
		}
	}
}
