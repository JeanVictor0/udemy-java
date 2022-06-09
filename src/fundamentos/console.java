package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia");
		System.out.print(" Garai");
		
		System.out.println("Oi");
		
		System.out.printf("Oi, dia %d", 1);
		System.out.printf("Salario: %.1f %n", 1234.1234);
		
		
		System.out.print("Escreva seu nome: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		System.out.print("Qual sua idade? ");
		int idade = entrada.nextInt();
		
		System.out.printf("Seu nome é %s e sua idade e %d ",nome,idade);
		
		entrada.close();
	}
}
