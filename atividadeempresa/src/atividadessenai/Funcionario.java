package atividadessenai;

public abstract class Funcionario {
	private String nome;
	private int id;
	private Double salarioBase;
	public Funcionario(String nome, int id, Double salarioBase) {
		this.nome = nome;
		this.id = id;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalario();
}
