package sistema;

public class Produto {
	private String nome;
	private double precoUnitario;
	public Produto(String nome, double precoUnitario) {
	this.nome = nome;
	this.precoUnitario = precoUnitario;
	}
	// Método necessário para o Information Expert em ItemVenda
	public double getPrecoUnitario() {
	return precoUnitario;
	}
	public String getNome() {
	return nome;
	}
	}
 


	