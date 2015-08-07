package br.com.waiso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.waiso.domain.Cartao;
import br.com.waiso.service.CartaoService;

@RestController("cartaoController")
@RequestMapping("/cartao")
public class CartaoController {

	@Autowired
	private CartaoService cartaoService;

	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Cartao> buscarCartao(@PathVariable Long id) {
		Cartao cartao = cartaoService.buscarCartao(id);
		if (objectNull(cartao)) {
			return new ResponseEntity<Cartao>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Cartao>(cartao, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List<Cartao>> buscarCartoes() {
		List<Cartao> cartoes = cartaoService.buscarCartoes();
		if (objectNull(cartoes)) {
			return new ResponseEntity<List<Cartao>>(HttpStatus.NOT_FOUND);
        }
       	return new ResponseEntity<List<Cartao>>(cartoes, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Cartao> inserirCartao(@RequestBody Cartao cartao) {
		cartaoService.inserirCartao(cartao);
		return new ResponseEntity<Cartao>(HttpStatus.OK);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Cartao> atualizarCartao(@RequestBody Cartao cartao, @PathVariable Long id) {
		cartaoService.atualizarCartao(cartao);
		return new ResponseEntity<Cartao>(cartao, HttpStatus.OK);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Cartao> deletarCartao(@PathVariable Long id) {
		cartaoService.deletarCartao(id);
		return new ResponseEntity<Cartao>(HttpStatus.OK);
	}
	
	private Boolean objectNull(Object object) {
		return object == null || object.equals(null);
	}

}