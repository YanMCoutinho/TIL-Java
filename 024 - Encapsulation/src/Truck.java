
public class Truck {
	private int wheel;
	private String color;
	private int numPassenger;
	
	//Constructor Method
	public Truck(int wheel, String color, int numPassenger) {
		this.wheel = wheel;
		this.color = color;
		this.numPassenger = numPassenger;
	}
	
	//Set Methods
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNumPassenger(int numPassenger) {
		this.numPassenger = numPassenger;
	}
	
	//Get Methods
	public int getWheel() {
		return this.wheel;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getNumPassenger() {
		return this.numPassenger;
	}
}
