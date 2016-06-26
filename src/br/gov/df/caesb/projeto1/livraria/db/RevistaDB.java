package br.gov.df.caesb.projeto1.livraria.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.gov.df.caesb.projeto1.livraria.entidades.Revista;

public class RevistaDB {
	
	public static final List<Revista> REVISTAS = new ArrayList<>();
	private static final Revista DEFAULT = new Revista("", null, 0.0);
	
	
	static {
		Revista e1 = new Revista("Curso",EditoraDB.findEditoraByName("Ro"),12.10);
		Revista e2 = new Revista("Rumo",EditoraDB.findEditoraByName("Man"),9.90);
		Revista e3 = new Revista("Vida",EditoraDB.findEditoraByName("Lua"),19.12);
		Revista e4 = new Revista("Morte",EditoraDB.findEditoraByName("Lua"),5.30);
		Revista e5 = new Revista("Moral",EditoraDB.findEditoraByName("Ro"),12.30);
		REVISTAS.addAll(Arrays.asList(e1,e2,e3,e4,e5));
	}
	
	public static Revista findRevistaByName(String nome){
		List<Revista> editoras = REVISTAS.stream().filter(e -> e.getNome().startsWith(nome)).collect(Collectors.toList());
		
		return editoras.isEmpty() ? DEFAULT : editoras.get(0);
	}
	
	public static List<Revista> listarRevistas(){
		REVISTAS.sort(Comparator.comparing(Revista::getNome).reversed());
		return REVISTAS;
	}

}
