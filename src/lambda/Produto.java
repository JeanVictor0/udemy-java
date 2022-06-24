package lambda;

public class Produto extends Object {
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("Produto: %s", this.nome);
	}
	
	
	
	
}