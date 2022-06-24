package orientacaoAObjeto.polimorfismo;

public class Comida {
	Comida(double peso){
		setPeso(peso);
	}
	
	protected double peso;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0 ) {
			this.peso = peso;
		}

	}
	

}
