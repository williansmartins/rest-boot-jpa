package br.com.waiso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.waiso.domain.Cartao;

@Repository("cartaoRepository")
//@RepositoryRestResource
//@RestResource(exported = false)
public interface CartaoRepository extends JpaRepository<Cartao, Long> {
	
}
