package multiplo10;

public class mult10 {

	public static void main(String[] args) {
		
		for(int num = 1; num <= 100; num++ ) {
			System.out.print(num);
			if (num%10 == 0) {
				System.out.println(" - Múltiplo de 10");
			} else {
				System.out.println();
			}
		}

	}

}
