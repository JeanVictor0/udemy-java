package modelo.base;

import infra.DAO;

public class NovoProduto {
	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		
		Produto produto = new Produto("Caneta",7.25);
		
		dao.abrirT().incluir(produto).fecharT();
		
		dao.incluirAtomico(produto);
		
		
		
		
		
	}
}
