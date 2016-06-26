package br.gov.df.caesb.aula2;

import java.math.BigDecimal;

public class TrabalhadorBase extends Trabalhador {

	public TrabalhadorBase(String nome, String sobrenome, BigDecimal salario) {
		super(nome, sobrenome, salario);
	}

	@Override
	public void calcularSalario() {
		salarioMes = salario;
	}
	
	@Override
	public String toString() {
		return "O Salário do trabalhador "+nome+" "+sobrenome+" é de "+getSalarioMes();
	}
}
