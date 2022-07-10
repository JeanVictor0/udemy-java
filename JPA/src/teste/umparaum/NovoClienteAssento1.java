package teste.umparaum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Ana",assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento)
			.incluirAtomico(cliente)
			.fecharT();
	}
}
