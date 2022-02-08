
public abstract class Animal {
	String color;
	String name;
	double height;
	
	//Constructor Method
	public Animal(String color, String name,double height) {
		this.color = color;
		this.name = name;
		this.height = height;
	}
	
	public Animal() {}
	
	//Getters
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	//Setters
	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Unique Methods
	public abstract void run(); //prints the animal's speed
	
	public abstract void feed(); //prints the animal's diet
	
	public abstract void sleep(); //prints the animal sleep time
	
	public abstract void makeSound(); //prints the animal's sound
	
	public void particulars() {
		this.run();
		this.feed();
		this.makeSound();
	}
}
