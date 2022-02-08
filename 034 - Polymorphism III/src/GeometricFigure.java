
public abstract class GeometricFigure {
	protected String figName;

	//Getters and Setters
	public String getFigName() {
		return figName;
	}
	
	//Unique Methods
	public abstract double calcArea();
		
	public void printArea() {
		System.out.println("A área do " + this.getFigName() + " é: " + this.calcArea());
	}
}
