package teste.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.base.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		Usuario usuario = new Usuario("Khirya","khirya@gmail.com");
//		usuario.setId(1L);
		em.persist(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
