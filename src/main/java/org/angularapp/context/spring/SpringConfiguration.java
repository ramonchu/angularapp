package org.angularapp.context.spring;

import org.angularapp.context.dao.UsuarioDao;
import org.angularapp.context.dao.jpa.UsuarioDaoJpa;
import org.angularapp.context.service.UsuarioService;
import org.angularapp.context.service.impl.UsuarioServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public UsuarioDao usuarioDao() {
		return new UsuarioDaoJpa();
	}

	@Bean
	public UsuarioService usuarioService() {
		return new UsuarioServiceImpl();
	}
}
