
public abstract class Vehicle {
	private String model;
	private double listedValue;
	private String color;
	private String fuel;
	private double ipva;
	
	//Constructor Method
	public Vehicle(String model, double listedValue, String color, String fuel) {
		this.model = model;
		this.listedValue = listedValue;
		this.color = color;
		this.fuel = fuel;
		this.ipva = this.calcIpva();
	}
	
	//Getters
	public String getModel() {
		return model;
	}

	public double getListedValue() {
		return listedValue;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public double getIpva() {
		return ipva;
	}
	
	//Setters	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setListedValue(double listedValue) {
		this.listedValue = listedValue;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	//Unique Methods
	public abstract double calcIpva(); //calculate the ipva attribute value based on listedValue attribute
	
	public abstract void printAttributes(); //prints the state of the object
	
}
