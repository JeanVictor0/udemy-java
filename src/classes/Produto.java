package classes;

public class Produto {
	String nome;
	double preco;
	final static double desconto = 0.25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	 
	
	double produtoComDesconto() {
		
		return preco * (1 - desconto);
	}
	
	
	
}
