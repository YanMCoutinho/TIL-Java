import java.util.Scanner;

public class FatorialFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int fatorial = 1;
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		for (int aux = 1; aux <= num; aux++) {

			
			fatorial = fatorial * aux;
			
			System.out.printf( "%n%d != %d", aux, fatorial);
		}
		
		sc.close();
	}

}