package br.com.pfizer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.pfizer.model.Projeto;
import br.com.pfizer.repository.ProjetoRepository;

@Service
public class ProjetoService {
	
	private ProjetoRepository repository;
	
	public Projeto save(Projeto projeto) {
		return repository.save(projeto);
	}
	
	public Optional<Projeto> findById(Long id) {
		return repository.findById(id);
	}
	
	public List<Projeto> findAll(){
		return repository.findAll();
	}

}
