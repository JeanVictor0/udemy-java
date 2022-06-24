package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		
		
		
		
		Consumer <Produto> imprimir = valor -> System.out.println(valor.nome); 
		
		Produto produto = new Produto("Notebook",2330.99,15);

		List<Produto> produtos = Arrays.asList(produto);
		imprimir.accept(produto);
		
		produtos.forEach(imprimir);
		
	}
}
