
public class Motorcycle extends Vehicle{

	public Motorcycle(String model, double listedValue, String color, String fuel) {
		super(model, listedValue, color, fuel);
	}

	@Override
	public double calcIpva() {
		this.setIpva((this.getListedValue() * 0.02));
		return this.getIpva();
	}

	@Override
	public void printAttributes() {
		System.out.println("Modelo: " + this.getModel());
		System.out.println("Valor de Tabela: " + this.getListedValue());
		System.out.println("Cor: " + this.getColor());
		System.out.println("Combústivel: " + this.getFuel());
		System.out.println("Ipva: " + this.getIpva());
		System.out.println();
	}

}
