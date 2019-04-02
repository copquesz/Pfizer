package br.com.pfizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pfizer.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

}
