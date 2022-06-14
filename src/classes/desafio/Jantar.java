package classes.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao",70.5);
		Comida macarrao = new Comida("Macarrao",0.5);
		
		System.out.printf("Ola sou %s, meu peso: %.2f\n",joao.nome,joao.peso);
		
		joao.comer(macarrao.peso);
		
		System.out.printf("Eu comi %s e meu peso agora: %.2f\n",macarrao.nome,joao.peso);
		
	}
}
