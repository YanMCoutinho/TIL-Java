
public class EvenOrOdd {

	// Constructor Method
	public EvenOrOdd() {
	}

	// EvenOrOdd Unique Methods
	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean[] isEven(int[] num) {
		boolean[] listIsEven = new boolean[num.length];

		for (int column = 0; column < num.length; column++) {
			if (num[column] % 2 == 0) {
				listIsEven[column] = true;
			} else {
				listIsEven[column] = false;
			}
		}

		return listIsEven;
	}

	public void printIsEven(boolean answerIsEven, int num) {
		if (answerIsEven) {
			System.out.printf("%nO número %d é par", num);
		} else {
			System.out.printf("%nO número %d é impar", num);
		}
	}

	public void printIsEven(boolean[] answerIsEven, int[] num) {
		for (int column = 0; column < answerIsEven.length; column++) {
			if (answerIsEven[column]) {
				System.out.printf("%nO número %d é par", num[column]);
			} else {
				System.out.printf("%nO número %d é impar", num[column]);
			}
		}
	}
}
