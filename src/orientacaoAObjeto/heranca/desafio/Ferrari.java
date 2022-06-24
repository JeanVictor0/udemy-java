package orientacaoAObjeto.heranca.desafio;

import java.util.Arrays;

public class Ferrari extends Carro implements Esportivo {//,luxo
	
	public void ligarTurbo() {
		
	}
	
	public void desligarTurbo() {
		
	}

	public boolean acelerar() {
		Boolean [] acelerando = new Boolean[3];
		for (int i = 0 ; i < 3 ; i++) {
			acelerando[i] = super.acelerar();
		}
		
		if (Arrays.asList(acelerando).contains(false)) {
			return false;
		} else {
			return true;
		}
	}
}
