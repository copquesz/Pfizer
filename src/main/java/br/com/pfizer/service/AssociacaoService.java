package br.com.pfizer.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.pfizer.model.Associacao;
import br.com.pfizer.repository.AssociacaoRepository;
import br.com.pfizer.util.FileUpload;

@Service
public class AssociacaoService {

	private AssociacaoRepository repository;

	public Associacao save(Associacao associacao) {
		return repository.save(associacao);
	}

	public Optional<Associacao> findById(Long id) {
		return repository.findById(id);
	}

	public List<Associacao> findAll() {
		return repository.findAll();
	}

	// Serviço que faz o upload de arquivos para o servidor
	public String upload(HttpServletRequest request, MultipartFile arquivo, String nomeArquivo, String url) {
		return FileUpload.upload(request, arquivo, nomeArquivo, url);
	}

}
