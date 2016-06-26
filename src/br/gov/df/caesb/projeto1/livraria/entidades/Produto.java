package br.gov.df.caesb.projeto1.livraria.entidades;

public interface Produto {
	Double getValor();
	
	default public void imprimeMensagemProduto(){
		System.out.println("Interface produto executada");
	}

}
