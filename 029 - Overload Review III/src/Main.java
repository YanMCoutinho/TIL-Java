import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		p.setName(scan.nextLine());
		
		System.out.println("Digite a altura da pessoa: ");
		p.setHeight(scan.nextDouble());
		
		scan.nextLine();
		
		System.out.println("Digite a frase que você quer que essa pessoa diga: ");
		p.sayThatPhrase(scan.nextLine());
		
		p.printAttributes();
		
		System.out.println("A frase padrão dessa pessoa é: ");
		p.sayThatPhrase();
		
		scan.close();
	}

}
