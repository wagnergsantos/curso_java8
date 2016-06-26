package br.gov.df.caesb.projeto1.livraria.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.gov.df.caesb.projeto1.livraria.entidades.Editora;

public class EditoraDB {
	
	public static final List<Editora> EDITORAS = new ArrayList<>();
	private static final Editora DEFAULT = new Editora("", "", "");
	
	
	static {
		Editora e1 = new Editora("Lua", "Lua ed", "11.111.111/1111-11");
		Editora e2 = new Editora("Royal", "Royal ed", "22.222.222/2222-22");
		Editora e3 = new Editora("Manicômio", "Mani ed", "33.333.333/3333-33");
		EDITORAS.addAll(Arrays.asList(e1,e2,e3));
	}
	
	public static Editora findEditoraByName(String nome){
		List<Editora> editoras = EDITORAS.stream().filter(e -> e.getNomeFantasia().startsWith(nome)).collect(Collectors.toList());
		
		return editoras.isEmpty() ? DEFAULT : editoras.get(0);
	}

}
