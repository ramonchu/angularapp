package org.angularapp.context.service;

import java.util.List;

import org.angularapp.context.bean.Usuario;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public interface UsuarioService {
	public List<Usuario> getUsuarios();

	public void saveUsuario(Usuario user);
}
