package arrayAndCollections;

import java.util.Iterator;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = new double[5];
		
		for ( int i = 0 ; i < notas.length ;i++) {
			notas[i] = i;
			System.out.println(i);
		}
		
		for (double nota: notas) {
			System.out.println(nota);
		}
				
			
	}
}
