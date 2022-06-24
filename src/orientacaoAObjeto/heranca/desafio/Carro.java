package orientacaoAObjeto.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	Carro(){
		this(200);	
	}
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			return false;
		} else {
			velocidadeAtual += 5;
			return true;
		}
	}
	
	public boolean freiar() {
		if (velocidadeAtual < 5 ) {
			return false;
		} else {
			velocidadeAtual -= 5;
			return true;
		}
	}
}	
