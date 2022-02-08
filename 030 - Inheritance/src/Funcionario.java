
public class Funcionario {
	private String nome;
	private String cpf;
	protected int salario;
	
	//Constructor Method
	public Funcionario(String nome, String cpf, int salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionario() {}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public int getSalario() {
		return salario;
	}
	
	//Setters
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Unique Methods
	public double getBonificacao() {
		return this.salario * 1.10;
	}
	
}
