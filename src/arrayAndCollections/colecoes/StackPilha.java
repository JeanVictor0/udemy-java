package arrayAndCollections.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Um pequeno principe"); // true
		livros.push("Don Quixote"); //Retorna nada ou limite de capacidade
		livros.push("Teste");
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());

//		System.out.println(livros.poll());
//		System.out.println(livros.remove()); // excessao
//		System.out.println(livros.pop()); // excessao
		
		System.out.println(livros.isEmpty());
		for (String livro: livros) {
			System.out.println(livro);
		}
	}
}
