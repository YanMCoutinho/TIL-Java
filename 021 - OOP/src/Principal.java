
public class Principal {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println("Saldo na conta inicial = " + primeiraConta.saldo);
		
		primeiraConta.depositar(200);
		System.out.println("Saldo após deposito = " + primeiraConta.extrato());
		System.out.println(primeiraConta.sacar(500));
		System.out.println("Saldo final da conta = " + primeiraConta.saldo);
		System.out.println(primeiraConta.extrato());
		
	}

}
