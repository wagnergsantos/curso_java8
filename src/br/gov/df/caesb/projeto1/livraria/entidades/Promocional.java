package br.gov.df.caesb.projeto1.livraria.entidades;

public interface Promocional {
	void aplicarDesconto(Double desconto);
	
	default public void imprimeMensagemPromocional(){
		System.out.println("Interface produto executada");
	}
}
