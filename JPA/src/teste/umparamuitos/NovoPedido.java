package teste.umparamuitos;

import infra.DAO;
import modelo.base.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<Object>();
		
		Produto produto = new Produto("Geladeira",2404.20);
		
		Pedido pedido = new Pedido();
		
		ItemPedido item = new ItemPedido(pedido, produto, 1, null);
		
		dao.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT();
		
	}
}
