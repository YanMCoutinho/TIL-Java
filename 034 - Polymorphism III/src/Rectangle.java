
public class Rectangle extends GeometricFigure {
	private double width;
	private double height;
	
	//Constructor Methods
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.figName = "retângulo";
	};

	//Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//Unique Methods
	@Override
	public double calcArea() {
		return (this.getHeight() * this.getWidth());
	}
	
	public double calcArea(double height, double width) {
		return (height * width);
	}
}
