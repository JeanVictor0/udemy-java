package classes.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	public void comer(double peso) {
		this.peso += peso;
	}
}
