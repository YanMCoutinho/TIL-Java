import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.setNome(JOptionPane.showInputDialog("Digite o nome do Funcion�rio"));

		func.setCpf(JOptionPane.showInputDialog("Digite o cpf do funcion�rio"));
		
		func.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o sal�rio do funcion�rio")));
		
		JOptionPane.showMessageDialog(null, "Nome: "+ func.getNome() + "  CPF: " +func.getCpf() + "  Sal�rio: " + func.getSalario() + "  Sal�rio com cifra: " + func.getSalario("R$"));
	}
}
