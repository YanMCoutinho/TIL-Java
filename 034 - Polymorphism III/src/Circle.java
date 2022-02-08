
public class Circle extends GeometricFigure{
	private double radius;
	private static double pi = 3.14159265359;
	
	//Constructor Method
	public Circle(double radius) {
		this.radius = radius;
		this.figName = "círculo";
	}
	
	//Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return pi;
	}
	
	//Unique Methods
	@Override
	public double calcArea() {
		return ((this.getRadius() * this.getRadius()) * Circle.getPi());
	}

	public static double calcArea(double radius) {
		return ((radius * radius) * Circle.getPi());
	}
}
