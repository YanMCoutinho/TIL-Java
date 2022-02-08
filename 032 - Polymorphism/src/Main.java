
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Elephant elp = new Elephant();
		Jaguar jaguar = new Jaguar();
		
		callParticulars(dog);
		System.out.println();
		callParticulars(elp);
		System.out.println();
		callParticulars(jaguar);
	}
	
	public static void callParticulars(Animal animal) {
		animal.particulars();
	}

}


