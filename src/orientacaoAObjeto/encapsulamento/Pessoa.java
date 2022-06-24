package orientacaoAObjeto.encapsulamento;

public class Pessoa {
	private int idade;
	
	Pessoa(int idade){
		this.setIdade(idade);
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 1 && idade <= 100) {
			this.idade = idade;
		}
	}
	public String toString() {
		return String.format("Tenho %d anos", this.idade);
	}
}
