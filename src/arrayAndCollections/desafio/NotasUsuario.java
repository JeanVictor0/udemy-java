package arrayAndCollections.desafio;

import java.util.Scanner;

public class NotasUsuario {
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.print("Informe quantas notas quer adicionar: ");
		int quant = entradas.nextInt();
		
		float[] notas = new float[quant];
		
		for (int i = 0 ; i < notas.length ; i++) {
			
			System.out.printf("Adiciona nota %d: ",i);
			notas[i] = entradas.nextFloat();
		}
		
		entradas.close();
		
		System.out.print("\nNotas adicionadas: ");

		for(Float nota: notas) {
			System.out.println(nota);
		}
	}
}
