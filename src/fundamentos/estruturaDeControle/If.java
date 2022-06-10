package fundamentos.estruturaDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		double media = entrada.nextDouble();
		
		entrada.close();
		
		if( media >= 7.0 ) {
			System.out.println("O aluno passou!");
			
		
		} else {
			System.out.println("Aluno não passou");
		}
		
		// break, continue
		
	}
}
