package orientacaoAObjeto;

import orientacaoAObjeto.composicao.Carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.ligar();
		
		carro.acelera();
	}
}
