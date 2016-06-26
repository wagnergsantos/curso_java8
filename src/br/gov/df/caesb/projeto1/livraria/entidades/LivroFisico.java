package br.gov.df.caesb.projeto1.livraria.entidades;

public class LivroFisico extends Livro implements Promocional {

	public LivroFisico(String nome, Autor autor, Double valor) {
		super(nome, autor, valor);
	}

	@Override
	public void aplicarDesconto(Double desconto) {
		valor -= valor*desconto;
	}

}
