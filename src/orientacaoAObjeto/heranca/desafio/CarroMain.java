package orientacaoAObjeto.heranca.desafio;

public class CarroMain {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		ferrari.acelerar();
		Carro mustang = new Mustang();
		mustang.acelerar();
		
		if (ferrari.velocidadeAtual > mustang.velocidadeAtual) {
			System.out.println("VRUMMMMMMMMMMMMMMMM");
		}
		
	}
}
