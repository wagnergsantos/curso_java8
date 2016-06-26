package br.gov.df.caesb.projeto1.livraria.entidades;

public abstract class Livro implements Produto {
	protected String nome;
	protected String descricao;
	protected Autor autor;
	protected Double valor;
	protected String isbn;

	public Livro(String nome, Autor autor, Double valor) {
		this.nome = nome;
		this.autor = autor;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString(){
		return getNome();
	}
}
