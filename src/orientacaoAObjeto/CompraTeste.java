package orientacaoAObjeto;

import orientacaoAObjeto.composicao.Compra;
import orientacaoAObjeto.composicao.Item;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Marcelo";
		
//		c1.itens.adicionarItem("Caneta",20,7.45);
		
		System.out.println(c1.obterValorTotal());
	}
}
