package SomaImpar;

public class SomaImpar {

	public static void main(String[] args) { 
		int cont = 100;
		
		do {
			if (cont%2 == 1) {
				System.out.println(cont);
			}
			cont++;
		} while (cont<200);

	}

}
