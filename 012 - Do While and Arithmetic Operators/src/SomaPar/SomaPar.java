package SomaPar;

public class SomaPar {

	public static void main(String[] args) {
		int cont = 2;
		int soma = 0;
	
		while (cont<=200) {
			if (cont%2 == 0) {
				soma += cont;
			}
			
			cont++;			
		}
		
		System.out.println("O resultado de todos os n�meros pares de 2 a 200 � de " + soma);	
	}

}
