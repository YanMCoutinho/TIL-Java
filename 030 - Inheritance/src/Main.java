
public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Doni");
		f1.setCpf("4444.3333.4");
		f1.setSalario(2500);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		
		Gerente g1 = new Gerente();
		
		g1.setNome("PEDRO");
		g1.setCpf("3223232323");
		g1.setSalario(3000);
		g1.setSenha(2222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(2222));
		
		
	}

}
