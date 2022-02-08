package ExercicioProdutos;

public class Product {
	private String productName;
	private double costPrice;
	private double salePrice;
	private double profitMargin;
	
	//Constructor Method
	public Product(String productName, double costPrice, double salePrice, double profitMargin) {
		this.productName = productName;
		this.costPrice = costPrice;
		this.salePrice = salePrice;
		this.profitMargin = profitMargin;
	}
	
	public Product() {}

	//Set Methods
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	
	public boolean setSalePrice(double salePrice) {
		if (this.costPrice < salePrice) {
			this.salePrice = salePrice;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setProfitMargin(double profitMargin) {
		this.profitMargin = profitMargin;
	}
	
	//Get Methods
	public String getProductName() {
		return this.productName;
	}
	
	public double getCostPrice() {
		return this.costPrice;
	}
	
	public double getSalePrice() {
		return this.salePrice;
	}
	
	public double getProfitMargin() {
		return this.profitMargin;
	}
	
	//Profit Methods
	public void calcProfitMargin() {
		this.profitMargin = this.salePrice - this.costPrice;
	}
	
	public double getProfitMarginPercentage() {
		double profitMarginPercentage = ((100 * this.profitMargin)/this.costPrice);
		return profitMarginPercentage;
	}

}
