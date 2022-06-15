package orientacaoAObjeto.composicao;

public class Item {
	
	public String nome;
	public int quantidade;
	public double preco;
	public Compra compra;
	
	public Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

}
