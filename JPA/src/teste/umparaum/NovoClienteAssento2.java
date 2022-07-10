package teste.umparaum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		Assento assento = new Assento("11A");
		Cliente cliente = new Cliente("Rodrigo",assento);
		
		DAO<Cliente> dao = new DAO<>();
		
		dao.incluirAtomico(cliente);
		
	}
}
