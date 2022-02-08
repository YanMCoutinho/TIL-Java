
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
		
		System.out.println("O salário bruto de " + emplPedro.name + " é de " + emplPedro.grossSalary);
		System.out.println("As taxas pagas são de R$" + emplPedro.tax);
		System.out.println("Seu salário líquido é de R$" + emplPedro.netSalary());
		System.out.print("Após um aumento de R$1500,");
		emplPedro.increaseSalary(1500);
		System.out.println(" seu salário bruto ficou em R$" + emplPedro.grossSalary);
		
		System.out.println();
		
		System.out.println("O salário bruto de " + emplVagner.name + " é de " + emplVagner.grossSalary);
		System.out.println("As taxas pagas são de R$" + emplVagner.tax);
		System.out.printf("Seu salário líquido é de R$%.2f %n",emplVagner.netSalary());
		System.out.print("Após um aumento de R$1000,");
		emplVagner.increaseSalary(1000);
		System.out.println(" seu salário bruto ficou em R$" + emplVagner.grossSalary);
	}
}
