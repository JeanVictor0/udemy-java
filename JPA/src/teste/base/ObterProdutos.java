package teste.base;

import java.util.List;

import infra.ProdutoDao;
import modelo.base.Produto;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
		
		List<Produto> produtos = dao.obterTodos(0, 0);
		
		for(Produto produto: produtos) {
			System.out.println(produto.getId());
		}
		
		double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t,p) -> t + p)
				.doubleValue();
		
		System.out.println(precoTotal);
	}
}
