package br.gov.df.caesb.aula2;

import java.math.BigDecimal;

public class TrabalhadorHorista extends TrabalhadorBase {
	private Integer quantidadeDeHorasTrabalhadas;
	
	public TrabalhadorHorista(String nome, String sobrenome, BigDecimal salario, Integer quantidadeDeHorasTrabalhadas) {
		super(nome, sobrenome, salario);
		this.quantidadeDeHorasTrabalhadas = quantidadeDeHorasTrabalhadas;
	}

	public Integer getQuantidadeDeHorasTrabalhadas() {
		return quantidadeDeHorasTrabalhadas;
	}

	public void setQuantidadeDeHorasTrabalhadas(Integer quantidadeDeHorasTrabalhadas) {
		this.quantidadeDeHorasTrabalhadas = quantidadeDeHorasTrabalhadas;
	}

	@Override
	public void calcularSalario() {
		salarioMes = salario.multiply(BigDecimal.valueOf(quantidadeDeHorasTrabalhadas));
	}
	
	@Override
	public String toString() {
		return "O Salário do horista "+nome+" "+sobrenome+" é de "+getSalarioMes();
	}	
	
}
