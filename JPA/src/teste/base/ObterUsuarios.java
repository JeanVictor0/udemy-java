package teste.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.base.Usuario;

public class ObterUsuarios {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u.* from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql,Usuario.class);
		query.setMaxResults(9);
		
		List<Usuario> usuarios = query.getResultList();

		for (Usuario usuario: usuarios) {
			System.out.println();
		}
		
		em.close();
		emf.close();
		
	}
}
