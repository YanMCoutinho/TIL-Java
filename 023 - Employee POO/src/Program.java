
public class Program {

	public static void main(String[] args) {
		Employee emplPedro = new Employee();
		Employee emplVagner = new Employee();
	
		emplPedro.name = "Pedro";
		emplPedro.grossSalary = 2000.00;
		emplPedro.tax = 1900;
		
		emplVagner.name = "Vagner";
		emplVagner.grossSalary = 2200.75;
		emplVagner.tax = 2000.15;
		
		System.out.println("O sal�rio bruto de " + emplPedro.name + " � de " + emplPedro.grossSalary);
		System.out.println("As taxas pagas s�o de R$" + emplPedro.tax);
		System.out.println("Seu sal�rio l�quido � de R$" + emplPedro.netSalary());
		System.out.print("Ap�s um aumento de R$1500,");
		emplPedro.increaseSalary(1500);
		System.out.println(" seu sal�rio bruto ficou em R$" + emplPedro.grossSalary);
		
		System.out.println();
		
		System.out.println("O sal�rio bruto de " + emplVagner.name + " � de " + emplVagner.grossSalary);
		System.out.println("As taxas pagas s�o de R$" + emplVagner.tax);
		System.out.printf("Seu sal�rio l�quido � de R$%.2f %n",emplVagner.netSalary());
		System.out.print("Ap�s um aumento de R$1000,");
		emplVagner.increaseSalary(1000);
		System.out.println(" seu sal�rio bruto ficou em R$" + emplVagner.grossSalary);
	}
}
