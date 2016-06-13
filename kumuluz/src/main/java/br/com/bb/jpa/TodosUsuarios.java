package br.com.bb.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TodosUsuarios {

	@PersistenceContext(unitName = "jpa")
	private EntityManager entityManager;

	public Usuario salvar(Usuario usuario) {

		// pode fazer um interceptor do CDI ou usar o DeltaSpike para resolver
		// este código de Transação
		entityManager.getTransaction().begin();

		usuario = entityManager.merge(usuario);

		entityManager.getTransaction().commit();

		return usuario;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> listar() {
		return entityManager.createQuery("select u from Usuario u").getResultList();
	}

}
