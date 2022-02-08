
public class Dog extends Animal {
	@Override
	public void run() {
		System.out.println("Os cachorros atingem a velocidade de 30 km por hora");
	}

	@Override
	public void feed() {
		System.out.println("Os cachorros se alimentam de ração");
	}

	@Override
	public void sleep() {
		System.out.println("Os cachorros dormem 8 horas por dia, eu acho...");
	}

	@Override
	public void makeSound() {
		System.out.println("O som emitido pelos cachorros é: au-au-au");
	}
}
