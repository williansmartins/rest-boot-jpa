package br.com.waiso.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_cartao")
// @JsonIgnoreProperties(ignoreUnknown=true)
public class Cartao implements Serializable {

	private static final long serialVersionUID = -8621624968952471619L;

	public Cartao() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "banco", nullable = false, length = 60)
	@NotNull
	@Size(max = 60)
	private String banco;

	@Column(name = "agencia", nullable = false, length = 60)
	@NotNull
	@Size(max = 60)
	private String agencia;

	@Column(name = "conta", nullable = false, length = 10)
	@NotNull
	@Size(max = 10)
	private String conta;

	@Column(name = "gerente", nullable = false, length = 10)
	@NotNull
	@Size(max = 10)
	private String gerente;

	@Column(name = "senha_cartao", nullable = false, length = 10)
	@NotNull
	@Size(max = 10)
	private String senhaCartao;

	@Column(name = "senha_internet", length = 10)
	@NotNull
	@Size(max = 10)
	private String senhaInternet;

	@Column(name = "senha_letras", length = 60)
	@NotNull
	@Size(max = 60)
	private String senhaLetras;

	@Column(name = "senha_token", length = 60)
	@NotNull
	@Size(max = 60)
	private String senhaToken;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getSenhaCartao() {
		return senhaCartao;
	}

	public void setSenhaCartao(String senhaCartao) {
		this.senhaCartao = senhaCartao;
	}

	public String getSenhaInternet() {
		return senhaInternet;
	}

	public void setSenhaInternet(String senhaInternet) {
		this.senhaInternet = senhaInternet;
	}

	public String getSenhaLetras() {
		return senhaLetras;
	}

	public void setSenhaLetras(String senhaLetras) {
		this.senhaLetras = senhaLetras;
	}

	public String getSenhaToken() {
		return senhaToken;
	}

	public void setSenhaToken(String senhaToken) {
		this.senhaToken = senhaToken;
	}

}
