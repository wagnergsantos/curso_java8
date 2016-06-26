package br.gov.df.caesb.aula7;

public class ContaAgua {
	private Integer codigo;
	private String descricao;
	private Double valor;	
	
	public ContaAgua(Integer codigo, String descricao, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ContaAgua [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
	
}
