package org.angularapp.web.controller;

import java.util.List;

import org.angularapp.context.bean.Usuario;
import org.angularapp.context.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping
	public String index(Model model) {
		return "index";
	}

	@ResponseBody
	@RequestMapping("/user/list")
	public List<Usuario> restMethod(Model model) {
		List<Usuario> users = usuarioService.getUsuarios();
		if (users.size() == 0) {
			Usuario user = new Usuario();
			user.setEmail("ramon.arnau@gmail.com");
			user.setUsername("ramonchu");
			usuarioService.saveUsuario(user);
			users = usuarioService.getUsuarios();
		}
		return users;
	}

}
