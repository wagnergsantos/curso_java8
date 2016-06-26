package br.gov.df.caesb.aula2;

import java.math.BigDecimal;

public abstract class Trabalhador {
	protected String nome;
	protected String sobrenome;
	protected BigDecimal salario;
	protected BigDecimal salarioMes;

	public Trabalhador(String nome, String sobrenome, BigDecimal salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public BigDecimal getSalarioMes() {
		executaCalculoSalario();
		return salarioMes;
	}

	public void setSalarioMes(BigDecimal salarioMes) {
		this.salarioMes = salarioMes;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}
	
	private void executaCalculoSalario(){
		if (salarioMes == null){
			calcularSalario();
		}
	}

	protected abstract void calcularSalario();
}
