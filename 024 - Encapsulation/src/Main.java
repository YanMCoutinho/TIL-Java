
public class Main {

	public static void main(String[] args) {
		Car celta = new Car(4, "preto", 5);
		Truck scania = new Truck(6, "azul", 3);
		Motorcycle biz = new Motorcycle();
		
		biz.wheel = 2;
		biz.color = "branco";
		biz.numPassenger = 2;
		
		//Changing the attributes
		celta.setWheel(2);
		celta.setColor("branco");
		celta.setNumPassenger(3);
		
		scania.setWheel(4);
		scania.setColor("vermelho");
		scania.setNumPassenger(2);
		
		biz.wheel = 1;
		biz.color = "preto";
		biz.numPassenger = 3;
		
		//Showing the attributes
		System.out.printf("Celta%n");
		System.out.println("Rodas: "+celta.getWheel());
		System.out.println("Cor: "+celta.getColor());
		System.out.println("Quantidade de Passageiros: "+celta.getNumPassenger());
		
		System.out.printf("%nScania%n");
		System.out.println("Rodas: "+scania.getWheel());
		System.out.println("Cor: "+scania.getColor());
		System.out.println("Quantidade de Passageiros: "+scania.getNumPassenger());
		
		
		System.out.printf("%nBiz%n");
		System.out.println("Rodas: "+ biz.wheel);
		System.out.println("Cor: "+biz.color);
		System.out.println("Quantidade de Passageiros: "+biz.numPassenger);
	}

}
