package br.com.pfizer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pfizer.model.Usuario;
import br.com.pfizer.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}

	public Optional<Usuario> findById(Long id) {
		return repository.findById(id);
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

}
