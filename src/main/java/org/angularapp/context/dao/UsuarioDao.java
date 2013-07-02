package org.angularapp.context.dao;

import java.util.List;

import org.angularapp.context.bean.Usuario;

public interface UsuarioDao {
	public List<Usuario> getUsuarios();

	public void saveUsuario(Usuario user);
}
