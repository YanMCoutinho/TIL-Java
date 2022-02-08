
public class Main {

	public static void main(String[] args) {
		Circle cic = new Circle(10);
		Square sqr = new Square(10);
		Triangle tri = new Triangle(10, 2);
		Rectangle rtg = new Rectangle(10, 10); 
		
		cic.printArea();
		sqr.printArea();
		tri.printArea();
		rtg.printArea();
	}
}
