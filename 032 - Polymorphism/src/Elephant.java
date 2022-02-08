
public class Elephant extends Animal{
	@Override
	public void run() {
		System.out.println("Os elefantes atingem a velocidade de 5 km por hora");
	}

	@Override
	public void feed() {
		System.out.println("Os elefantes se alimentam de frutas e folhas");
	}

	@Override
	public void sleep() {
		System.out.println("Os elefantes dormem 8 horas por dia, eu acho...");
	}

	@Override
	public void makeSound() {
		System.out.println("O som emitido pelos elefantes é: PRUUUUUUUUU");
	}
}
