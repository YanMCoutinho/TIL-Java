
public abstract class Account {
	int number;
	int agency;
	double balance;
	String accountHolder;
	
	//Constructor Method
	public Account(int number, int agency, double balance, String accountHolder) {
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	
	//Getters and Setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAgency() {
		return agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	//Unique Functions
	public void draw(double value) {
		if (value > this.balance) {
			System.out.println("Não é possível sacar um valor maior que o saldo da conta!");
			return;
		}
		if (value <= 0) {
			System.out.println("Não é possível sacar um valor menor ou igual a zero!");
			return;
		}
		this.balance -= value;
	}
	
	public void deposit(double value) {
		if (value <= 0) {
			System.out.println("Não é possível depositar um valor menor ou igual a zero!");
			return;
		}
		this.balance += value;
	}
	
	public void accountInfo() {
		System.out.println("Nome do titular da conta: " + this.getAccountHolder());
		System.out.println("Número da conta: " + this.getNumber());
		System.out.println("Número da agência: " + this.getAgency());
		System.out.println("Saldo da conta: " + this.getBalance());
	}
}
