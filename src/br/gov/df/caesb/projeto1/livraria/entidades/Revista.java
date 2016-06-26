package br.gov.df.caesb.projeto1.livraria.entidades;

public class Revista implements Produto {
	protected String nome;
	protected String descricao;
	protected Editora editora;
	protected Double valor;

	public Revista(String nome, Editora editora, Double valor) {
		this.nome = nome;
		setEditora(editora);
		this.valor = valor;
		imprimeMensagemProduto();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString(){
		return "Revista: "+nome;
	}

}
