
public class Client {
	private String name;
	private int age;
	private String address;
	private double discount = 0.90;
	
	//Constructor Method
	public Client(String name, int age, String address, double discount) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Client() {}
	
	//Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public double getDiscount() {
		return discount;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	//Unique Methods 
	public static double calcDiscount(double valuePurchase) {
		return (valuePurchase * 0.90);
	}
	
}
