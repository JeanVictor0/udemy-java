package arrayAndCollections.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Colecoes {
	public static void main(String[] args) {
//	ArrayList
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Bia"); // false
		fila.add("Joao"); 
;		fila.add("Oi");
		System.out.println(fila.offer("Ana"));// excessao
		System.out.println(fila);
		System.out.println(fila.peek()); //false
		System.out.println(fila.element()); //excessao
		System.out.println(fila.size());
		// fila.clear();
		System.out.println(fila.isEmpty());
		
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		System.out.println(fila.contains("Ana"));
	}
}
