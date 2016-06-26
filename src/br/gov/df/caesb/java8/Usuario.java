package br.gov.df.caesb.java8;

public class Usuario {
	private String nome;
	private Integer pontos;
	private Boolean moderador;
	
	public Usuario() {
	}
	
	public Usuario(String nome, Integer pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Boolean isModerador() {
		return moderador;
	}
	
	public void tornarModerador(){
		moderador = Boolean.TRUE;
	}
	
	public void removerModerador(){
		moderador = Boolean.FALSE;
	}
}
