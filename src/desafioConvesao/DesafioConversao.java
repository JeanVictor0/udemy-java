package desafioConvesao;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner analise = new Scanner(System.in);
		
		System.out.println("Digite seus 3 ultimos salarios: ");
		double salario1 = Double.parseDouble(analise.next().replace('.', ','));
		
		double salario2 = Double.parseDouble(analise.next().replace('.', ','));
		
		double salario3 = Double.parseDouble(analise.next().replace('.', ','));
		
		analise.close();
		
		System.out.printf("Seu salario a media foi %.2f", ((salario1 + salario2 + salario3) / 3.0 ));
	}

	
	
	
	
}
