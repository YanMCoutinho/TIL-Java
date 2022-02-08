
public class Main {

	public static void main(String[] args) {
		CheckingAccount conta1 = new CheckingAccount(105, 120, 100.0, "José Neto Filho da Silva");
		PremiumAccount conta2 = new PremiumAccount(200, 350, 1000, 1500.0, "Carlos Porpetone Borba Braga");
		SavingsAccount conta3 = new SavingsAccount(530, 21341, 600000, "Meliza Hatsunaga");
		
		callAccountFunctions(conta1);
		callAccountFunctions(conta2);
		callAccountFunctions(conta3);
	}
	public static void callAccountFunctions(Account conta) {
		System.out.println();
		conta.accountInfo();
		System.out.println();
		conta.draw(200);
		System.out.println();
		conta.accountInfo();
		System.out.println();
		conta.deposit(300);
		conta.accountInfo();
	}
}
