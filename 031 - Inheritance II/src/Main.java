import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de compra que você quer calcular para o cliente comum: ");
		System.out.println("Valor com desconto = " + Client.calcDiscount(scan.nextDouble()));
	
		System.out.print("Digite o valor de compra que você quer calcular para o cliente Premium: ");
		System.out.println("Valor com desconto = " + PremiumClient.calcDiscount(scan.nextDouble()));
		
		scan.close();
	}

}
