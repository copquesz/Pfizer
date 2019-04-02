package br.com.pfizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pfizer.model.Associacao;

@Repository
public interface AssociacaoRepository extends JpaRepository<Associacao, Long>{

}
