package orientacaoAObjeto.polimorfismo;

public class Pessoa {
	Pessoa(double peso){
		setPeso(peso);
	}
	
	private double peso;
	
	public void comer(Comida comida) {
		setPeso(comida.getPeso());
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0 ) {
			this.peso = peso;
		}

	}
	
}
