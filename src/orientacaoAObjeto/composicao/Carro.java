package orientacaoAObjeto.composicao;

public class Carro {
	final Motor motor = new Motor();
	
	public void acelera() {
		if (motor.fatorInjecao > 2.5) {
			motor.fatorInjecao += 0.4;
		}
		
	}
	
	public void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}

	}
	
	public void ligar() {
		motor.ligado = true;
	}

	public void desligar() {
		motor.ligado = false;
	}

	public boolean estarLigado() {
		return motor.ligado;
	}
}
