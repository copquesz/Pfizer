package br.com.pfizer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.pfizer.model.Associacao;
import br.com.pfizer.repository.AssociacaoRepository;

@Service
public class AssociacaoService {
	
	private AssociacaoRepository repository;
	
	public Associacao save(Associacao associacao) {
		return repository.save(associacao);
	}
	
	public Optional<Associacao> findById(Long id) {
		return repository.findById(id);
	}
	
	public List<Associacao> findAll(){
		return repository.findAll();
	}

}
