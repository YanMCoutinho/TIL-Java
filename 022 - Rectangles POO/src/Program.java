public class Program {

	public static void main(String[] args) {
		Square quadrado1 = new Square();
		Square quadrado2 = new Square();
		
		quadrado1.height = 10;
		quadrado1.width = 10;
		quadrado2.height = 5;
		quadrado2.width = 5;
		
		System.out.println("A �rea do quadrado 1 � de: " + quadrado1.calcArea());
		System.out.println("A �rea do quadrado 2 � de: " + quadrado2.calcArea());
	}

}
