package orientacaoAObjeto.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	
	
	public boolean acelerar() {
		if (velocidadeAtual > 100) {
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
