package org.angularapp.context.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.angularapp.context.bean.Usuario;
import org.angularapp.context.dao.UsuarioDao;

public class UsuarioDaoJpa implements UsuarioDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() {
		return entityManager.createQuery("from Usuario").getResultList();
	}

	@Override
	public void saveUsuario(Usuario user) {
		entityManager.persist(user);

	}
}
