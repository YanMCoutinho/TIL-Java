
public class Main {

	public static void main(String[] args) {
		Car fusca = new Car("fusca", 100, "preto", "gasolina");
		Car fordCar = new Car("ford car", 200, "azul", "álcool");
		Motorcycle hondaCivic = new Motorcycle("Honda Civic", 100, "branco", "álcool");
		Motorcycle yamaha = new Motorcycle("Yamaha", 200, "verde", "gasolina");
		
		Vehicle[] garagem; 
		garagem = new Vehicle[4];
		
		garagem[0] = fusca;
		garagem[1] = fordCar;
		garagem[2] = hondaCivic;
		garagem[3] = yamaha;
		
		callPrintAttributes(garagem);
	}
	
	public static void callPrintAttributes(Vehicle[] garage) {
		for (int cont = 0; cont<garage.length; cont++) {
			garage[cont].printAttributes();
		}
	}
}
