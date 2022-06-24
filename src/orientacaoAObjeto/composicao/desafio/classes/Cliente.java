package orientacaoAObjeto.composicao.desafio.classes;

public class Cliente {
	public String nome;
	Compra compra = new Compra(null);
	
	Cliente(String nome){
		this.nome = nome;

	}
	
	public void AdicionarCompra(String compra){
//		this.compra(compra);
	}
}
