package br.gov.df.caesb.aula7;

public class PrincipalValidador {

	public static void main(String[] args) {
		Validador<String> validadorCep = valor -> valor.matches("[0-9]{4}-[0-9]{2}.[0-9]{3}");
		System.out.println(validadorCep.valida("71.699-024"));
	}

}
