package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		
		
		
		
		List <String> aprovados = Arrays.asList("Maria","Isabel","Marcus","Gaybriel");
		
//		aprovados.forEach((nome)-> {
////			System.out.println("Aprovados: " + nome);
//			
//		});
		
//		aprovados.forEach(System.out::println);
		
//		aprovados.forEach(nome -> meuImprimir(nome));
		
		aprovados.forEach(ForEach::meuImprimir);

	}
	
	static void meuImprimir(String nome) {
		System.out.println("Aprovados: " + nome);
	}
	

}
