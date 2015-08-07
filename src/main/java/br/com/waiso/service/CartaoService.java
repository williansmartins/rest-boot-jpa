package br.com.waiso.service;

import java.util.List;

import br.com.waiso.domain.Cartao;

public interface CartaoService {

	Cartao buscarCartao(Long id);
	
	List<Cartao> buscarCartoes();
	
	void inserirCartao(Cartao cartao);
	
	void atualizarCartao(Cartao cartao);
	
	void deletarCartao(Long id);
	
}
