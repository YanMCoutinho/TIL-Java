
public class Jaguar extends Animal {
	@Override
	public void run() {
		System.out.println("Os jaguares atingem a velocidade de 70 km por hora");
	}

	@Override
	public void feed() {
		System.out.println("Os jaguares se alimentam de carne de outros animais");
	}

	@Override
	public void sleep() {
		System.out.println("Os jaguares dormem 8 horas por dia, eu acho...");
	}

	@Override
	public void makeSound() {
		System.out.println("O som emitido pelos jaguares é: GGRRRRRRRRRA");
	}
}
