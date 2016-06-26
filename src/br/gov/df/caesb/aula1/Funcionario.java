package br.gov.df.caesb.aula1;

import java.util.Date;

public class Funcionario {
	private String nome;
	private String especialidade;
	private String atividade;
	private Integer horaExtra;

	private Date dataNascimento;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(Integer horaExtra) {
		this.horaExtra = horaExtra;
	}
	

}
