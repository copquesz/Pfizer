package br.com.pfizer.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.pfizer.model.Projeto;
import br.com.pfizer.repository.ProjetoRepository;
import br.com.pfizer.util.FileUpload;

@Service
public class ProjetoService {

	private ProjetoRepository repository;

	public Projeto save(Projeto projeto) {
		return repository.save(projeto);
	}

	public Optional<Projeto> findById(Long id) {
		return repository.findById(id);
	}

	public List<Projeto> findAll() {
		return repository.findAll();
	}

	// Serviço que faz o upload de arquivos para o servidor
	public String upload(HttpServletRequest request, MultipartFile arquivo, String nomeArquivo, String url) {
		return FileUpload.upload(request, arquivo, nomeArquivo, url);
	}

}
