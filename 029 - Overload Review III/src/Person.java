
public class Person {
	private String name;
	private double height;
	
	//Constructor Method
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public Person() {
		
	}
	
	//Getters Methods
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	//Setters Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Print this Attributes Method
	
	public void printAttributes() {
		System.out.println("Nome: " + this.name);
		System.out.printf("Altura: %.2f%n", this.height);
	}
	
	//This Person Say that Phrase Method
	public void sayThatPhrase(String phrase) {
		System.out.println(this.name + ": " + phrase);
	}
	
	public void sayThatPhrase() {
		System.out.println(this.name + ": Oi! Eu sou o/a " + this.name);
	}
}
