package br.gov.df.caesb.projeto1.livraria.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.gov.df.caesb.projeto1.livraria.entidades.Autor;
import br.gov.df.caesb.projeto1.livraria.entidades.Ebook;
import br.gov.df.caesb.projeto1.livraria.entidades.Livro;
import br.gov.df.caesb.projeto1.livraria.entidades.LivroFisico;
import br.gov.df.caesb.projeto1.livraria.entidades.MiniLivro;

public class LivroDB {
	
	public static final List<Livro> LIVROS = new ArrayList<>();
	private static final Livro DEFAULT = new LivroFisico("", null, 0.0);
	
	
	static {
		Livro e1 = new LivroFisico("Gerador Arc",AutorDB.findAutorByName("Wa"), 35.00);
		Livro e2 = new MiniLivro("Liga da Justiça",AutorDB.findAutorByName("Wa"), 15.90);
		Livro e3 = new LivroFisico("Amanhecer",AutorDB.findAutorByName("Fl"), 39.90);
		Livro e4 = new Ebook("Morte",AutorDB.findAutorByName("Pa"), 12.90,"27dhhhe88ehaal78");
		Livro e5 = new LivroFisico("Rolezinho",AutorDB.findAutorByName("Ar"), 21.90);
		Livro e6 = new Ebook("Sonho meu",AutorDB.findAutorByName("Pa"), 11.90,"dd334tg44aa");
		LIVROS.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
	}
	
	public static Livro findLivroByName(String nome){
		List<Livro> livros = LIVROS.stream().filter(e -> e.getNome().startsWith(nome)).collect(Collectors.toList());
		
		return livros.isEmpty() ? DEFAULT : livros.get(0);
	}
	
	public static List<Livro> listarLivros(){
		return LIVROS;
	}
	
	public static void agruparLivrosPorAutor(){
		Map<Autor,List<Livro>> livrosPorAutor = LIVROS.stream().collect(Collectors.groupingBy(Livro::getAutor));
		livrosPorAutor.forEach((k,v) -> System.out.println(k + " " +v ));
	}
	
	public static List<LivroFisico> listarLivrosFisicosMaisCaros(){
		
		return LIVROS.stream()
				  .filter(l -> l instanceof LivroFisico)
				  .filter(l -> l.getValor() >= 30)
				  .map(l -> (LivroFisico) l)
				  .collect(Collectors.toList());
	}
	
	public static Double valorSomaLivros(){
		return LIVROS.stream().mapToDouble(Livro::getValor).sum();
	}
	
	public static Double valorMediaLivros(){
		return LIVROS.stream().mapToDouble(Livro::getValor).average().orElse(0.0);
	}
	
	public static void main(String[] args) {
		listarLivrosFisicosMaisCaros().forEach(System.out::println);
		System.out.println(valorSomaLivros());
		System.out.println(valorMediaLivros());
	}

}
