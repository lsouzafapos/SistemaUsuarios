package br.com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.app.model.Usuario;
import br.com.app.repository.UsuarioRepository;

@Controller
@RequestMapping(value = "/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuarioRepository usuarios;

	@GetMapping
	public ModelAndView listar() {
		List<Usuario> lista = usuarios.findAll();
		ModelAndView modelAndView = new ModelAndView("usuarios");
		modelAndView.addObject("usuarios", lista);
		return modelAndView;
	}

}
