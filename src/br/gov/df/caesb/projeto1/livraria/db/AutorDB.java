package br.gov.df.caesb.projeto1.livraria.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.gov.df.caesb.projeto1.livraria.entidades.Autor;
import br.gov.df.caesb.projeto1.util.Validador;

public class AutorDB {
	
	public static final List<Autor> AUTORES = new ArrayList<>();
	private static final Autor DEFAULT = new Autor("", "", "");
	
	
	static {
		Autor e1 = new Autor("Wagner","111.111.111-11","wagner@email");
		Autor e2 = new Autor("Artur","222.222.222-","artur@email");
		Autor e3 = new Autor("Flávia","333.333.333-33","flavia@email");
		Autor e4 = new Autor("Paula","0.333.333-33","paula@email");
		AUTORES.addAll(Arrays.asList(e1,e2,e3,e4));
	}
	
	public static Autor findAutorByName(String nome){
		List<Autor> autores = AUTORES.stream().filter(e -> e.getNome().startsWith(nome)).collect(Collectors.toList());
		
		return autores.isEmpty() ? DEFAULT : autores.get(0);
	}
	
	public static List<Autor> listarAutoresValidos(){
		Validador<String> validarCpf = valor -> valor.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
		
		return AUTORES.stream().filter(a -> validarCpf.valida(a.getCpf())).collect(Collectors.toList());
		  
	}
	

}
