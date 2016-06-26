package br.gov.df.caesb.projeto1.livraria.entidades;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private Map<Integer, Produto> itens;
	private Double total;
	
	public CarrinhoDeCompras(){
		itens = new HashMap<>();
	}

	public Map<Integer, Produto> getItens() {
		return itens;
	}

	public void setProdutos(Map<Integer, Produto> itens) {
		this.itens = itens;
	}

	public Double getTotal() {		
		
		total = itens.entrySet().stream().mapToDouble(e -> e.getValue().getValor() * e.getKey()).sum();
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public void addProduto(Integer quantidade, Produto produto){
		itens.put(quantidade,produto);
	}
	
}
