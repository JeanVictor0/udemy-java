package classes;

public class ProdutoTeste {
	public static void main(String[] args) {

		String nome = "Notebook";
		
		Produto asd1 = new Produto(nome);
		
		asd1.preco = 124.12;
		asd1.desconto = 0.1;
		
		System.out.printf("Preço do produto final: %.2f",asd1.produtoComDesconto());
		
	}
}
