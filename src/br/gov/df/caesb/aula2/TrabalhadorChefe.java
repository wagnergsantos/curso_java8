package br.gov.df.caesb.aula2;

import java.math.BigDecimal;
import java.util.Calendar;

public class TrabalhadorChefe extends TrabalhadorBase {

	public TrabalhadorChefe(String nome, String sobrenome, BigDecimal salario) {
		super(nome, sobrenome, salario);
	}

	@Override
	public void calcularSalario() {
		salarioMes = salario.multiply(BigDecimal.valueOf(obterQuantidadeDeSemanasMesAtual()));
	}

	private Integer obterQuantidadeDeSemanasMesAtual() {
		Calendar dataBase = Calendar.getInstance();
		int ultimoDiaDoMes = dataBase.getActualMaximum(Calendar.DAY_OF_MONTH);
		dataBase.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
		return dataBase.get(Calendar.WEEK_OF_MONTH);
	}
	
	@Override
	public String toString() {
		return "O Salário do chefe "+nome+" "+sobrenome+" é de "+getSalarioMes();
	}
}
