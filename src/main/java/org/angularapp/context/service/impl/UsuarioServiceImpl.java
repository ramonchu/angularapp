package org.angularapp.context.service.impl;

import java.util.List;

import org.angularapp.context.bean.Usuario;
import org.angularapp.context.dao.UsuarioDao;
import org.angularapp.context.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public List<Usuario> getUsuarios() {
		return usuarioDao.getUsuarios();
	}

	@Override
	public void saveUsuario(Usuario user) {
		usuarioDao.saveUsuario(user);
	}

}
