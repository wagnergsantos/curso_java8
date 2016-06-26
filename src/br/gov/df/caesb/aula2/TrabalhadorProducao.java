package br.gov.df.caesb.aula2;

import java.math.BigDecimal;

public class TrabalhadorProducao extends TrabalhadorBase {
	private Integer quantidadeDeItensProduzidos;
	
	public TrabalhadorProducao(String nome, String sobrenome, BigDecimal salario, Integer quantidadeDeItensProduzidos) {
		super(nome, sobrenome, salario);
		this.quantidadeDeItensProduzidos = quantidadeDeItensProduzidos;
	}

	public Integer getQuantidadeDeItensProduzidos() {
		return quantidadeDeItensProduzidos;
	}

	public void setQuantidadeDeItensProduzidos(Integer quantidadeDeItensProduzidos) {
		this.quantidadeDeItensProduzidos = quantidadeDeItensProduzidos;
	}

	@Override
	public void calcularSalario() {
		salarioMes = salario.multiply(BigDecimal.valueOf(quantidadeDeItensProduzidos));
	}
	
	@Override
	public String toString() {
		return "O Salário do produtivista "+nome+" "+sobrenome+" é de "+getSalarioMes();
	}
	
}
