package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.base.Entidade;
import modelo.base.Produto;

public class DAO<E> {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicio-jpa");
		} catch (Exception e) {
			
		}
	}
	
	public DAO() {
		this(null);
	}
	
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public E obterPorId(Object id) {
		return em.find(classe,id);
	}
	
	public DAO<E> teste(){
		return this;
	}
	
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
		
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public List<E> obterTodos(int quantidade,int deslocamento){
		
		if (classe == null) {
			throw new UnsupportedOperationException("Classe is null");
		}
		
		String jpql = "select e from " + classe.getName() + "e";
		TypedQuery<E> query = em.createQuery(jpql,classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		return query.getResultList();
		
	}
	
	public static void main(String[] args) {
		new DAO<Produto>().teste();
	}
}
