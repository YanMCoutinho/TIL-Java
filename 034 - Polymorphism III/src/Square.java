
public class Square extends GeometricFigure {
	private double width;
	
	//Constructor Method
	public Square(double width) {
		this.width = width;
		this.figName = "quadrado";
	}
	
	//Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	//Unique Methods
	@Override
	public double calcArea() {
		return (this.getWidth() * this.getWidth());
	}
	
	public static double calcArea(double width) {
		return (width * width);
	}
}
