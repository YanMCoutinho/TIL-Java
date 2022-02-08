
public class Triangle extends GeometricFigure{
	private double height;
	private double width;
	
	//Constructor Methods	
	public Triangle(double height, double width) {
		this.width = width;
		this.height = height;
		this.figName = "triângulo";
	}

	//Getters and Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	//Unique Methods
	@Override
	public double calcArea() {
		return ((this.getWidth() * this.getHeight())/2);
	}
	
	public double calcArea(double width, double height) {
		return ((width * height)/2);
	}
}
