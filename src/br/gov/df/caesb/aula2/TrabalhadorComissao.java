package br.gov.df.caesb.aula2;

import java.math.BigDecimal;

public class TrabalhadorComissao extends TrabalhadorBase {
	private BigDecimal valorComissao;
	private Integer quantidadeItensVendidos;
	
	
	public TrabalhadorComissao(String nome, String sobrenome, BigDecimal salario, BigDecimal valorComissao, Integer quantidadeItensVendidos) {
		super(nome, sobrenome, salario);
		this.valorComissao = valorComissao;
		this.quantidadeItensVendidos = quantidadeItensVendidos;
	}

	public BigDecimal getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(BigDecimal percentualComissao) {
		this.valorComissao = percentualComissao;
	}

	public Integer getQuantidadeItensVendidos() {
		return quantidadeItensVendidos;
	}

	public void setQuantidadeItensVendidos(Integer quantidadeItensVendidos) {
		this.quantidadeItensVendidos = quantidadeItensVendidos;
	}

	@Override
	public void calcularSalario() {		
		salarioMes = salario.add(valorComissao.multiply(BigDecimal.valueOf(quantidadeItensVendidos)));
	}
	
	@Override
	public String toString() {
		return "O Salário do comissionado "+nome+" "+sobrenome+" é de "+getSalarioMes();
	}

}
