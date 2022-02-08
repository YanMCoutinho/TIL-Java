
public class Employee {
	String name;
	double grossSalary;
	double tax;
	
	double netSalary() {
		return grossSalary-tax;
	}
	
	void increaseSalary(double increase) {
		grossSalary += increase;
	}
}
