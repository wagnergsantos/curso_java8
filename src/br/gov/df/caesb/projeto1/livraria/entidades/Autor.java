package br.gov.df.caesb.projeto1.livraria.entidades;

public class Autor {
	public String nome;
	public String email;
	public String cpf;

	public Autor(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String biografia) {
		this.cpf = biografia;
	}
	
	@Override
	public String toString(){
		return getNome();
	}
}
