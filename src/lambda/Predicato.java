package lambda;

import java.util.function.Predicate;

public class Predicato {
	public static void main(String[] args) {
		
		
		
		
		Predicate<Produto> isExpansive = prod -> prod.preco >= 1000.0;
		
		Produto produto = new Produto("Notebook",2330.99,15);
		
		System.out.println(isExpansive.test(produto));
	}
}
