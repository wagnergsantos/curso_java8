package br.gov.df.caesb.projeto1.livraria.entidades;

public class Editora {
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public Editora(String nomeFantasia, String razaoSocial, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString(){
		return "Editora: "+nomeFantasia;
	}

}
