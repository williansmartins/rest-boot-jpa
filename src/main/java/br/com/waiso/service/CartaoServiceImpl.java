package br.com.waiso.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.waiso.dao.CartaoRepository;
import br.com.waiso.domain.Cartao;

@Service("cartaoService")
public class CartaoServiceImpl implements CartaoService {

	@Autowired
	private CartaoRepository cartaoRepository;

	@Transactional(value = TxType.REQUIRED)
	public Cartao buscarCartao(Long id) {
		Cartao cartao = cartaoRepository.findOne(id);
		return cartao;
	}

	@Transactional(value = TxType.REQUIRED)
	public List<Cartao> buscarCartoes() {
		List<Cartao> cartoes = cartaoRepository.findAll();
		return cartoes;
	}

	@Transactional(value = TxType.REQUIRED)
	public void inserirCartao(Cartao cartao) {
		cartaoRepository.save(cartao);
	}

	@Transactional(value = TxType.REQUIRED)
	public void atualizarCartao(Cartao cartao) {
		cartaoRepository.saveAndFlush(cartao);
	}

	@Transactional(value = TxType.REQUIRED)
	public void deletarCartao(Long id) {
		cartaoRepository.delete(id);
	}

}
