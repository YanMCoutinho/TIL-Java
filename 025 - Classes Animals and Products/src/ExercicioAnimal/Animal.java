package ExercicioAnimal;

public class Animal {
	private int qtyPaw;
	private String species;
	private double animalWeight;
	
	//Constructor Method
	public Animal(int qtyPaw, String species, double animalWeight) {
		this.qtyPaw = qtyPaw;
		this.species = species;
		this.animalWeight = animalWeight;
	}
	
	//Set Methods
	public void setQtyPaw(int qtyPaw) {
		this.qtyPaw = qtyPaw;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setAnimalWeight(double animalWeight) {
		this.animalWeight = animalWeight;
	}
	
	//Get Methods
	public int getQtyPaw() {
		return this.qtyPaw;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public double getAnimalWeight() {
		return this.animalWeight;
	}
	
	//Print Method
	public void printAttributes() {
		System.out.println("Quantidade de patas: " + getQtyPaw());
		System.out.println("Nome da espécie: " + getSpecies());
		System.out.println("Peso do animal: " + getAnimalWeight());
	}
}
