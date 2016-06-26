package br.gov.df.caesb.projeto1.livraria.entidades;

public class Ebook extends Livro implements Promocional {
	

	protected String watermark;
	
	public Ebook(String nome, Autor autor, Double valor, String watermark) {
		super(nome, autor, valor);
		this.watermark = watermark;
	}

	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}

	@Override
	public void aplicarDesconto(Double desconto) {
		valor -= valor*desconto;
	}

}
