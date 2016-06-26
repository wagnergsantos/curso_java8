package br.gov.df.caesb.projeto1;

import java.time.LocalDate;
import java.util.Scanner;

import br.gov.df.caesb.projeto1.datas.Assinatura;
import br.gov.df.caesb.projeto1.livraria.db.AutorDB;
import br.gov.df.caesb.projeto1.livraria.db.LivroDB;
import br.gov.df.caesb.projeto1.livraria.db.RevistaDB;
import br.gov.df.caesb.projeto1.livraria.entidades.CarrinhoDeCompras;
import br.gov.df.caesb.projeto1.livraria.entidades.Logar;

public class Principal {

	public static void main(String[] args) {
		scritp2();
		script4();
		script5();
		script7();
		script8();
		script9();
		script6();

	}
	
	public static void scritp2(){
		System.out.println("*** script 2 ***");
		RevistaDB.listarRevistas().forEach(System.out::println);
	}
	
	public static void script4(){
		System.out.println("*** script 4 ***");
		AutorDB.listarAutoresValidos().forEach(System.out::println);
	}
	
	public static void script5(){
		System.out.println("*** script 5 ***");
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.addProduto(2, LivroDB.findLivroByName("Gerador Arc"));
		carrinhoDeCompras.addProduto(1, LivroDB.findLivroByName("Liga da Justiça"));
		carrinhoDeCompras.addProduto(3, LivroDB.findLivroByName("Sonho meu"));
		System.out.println(String.format("O total das compras é: R$ %.2f",carrinhoDeCompras.getTotal()));
	}
	
	public static void script6(){
		System.out.println("*** script 6 ***");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o login: ");
		Integer login = sc.nextInt();
		if(Logar.efetuarLogin(login)){
			script5();
		} else {
			System.out.println("Digite um login válido");
		}
	}
	
	public static void script7(){
		System.out.println("*** script 7 ***");
		LivroDB.agruparLivrosPorAutor();
	}
	
	public static void script8(){
		System.out.println("*** script 8 ***");
		System.out.println("Livros mais caros: "+LivroDB.listarLivrosFisicosMaisCaros());
		System.out.println(String.format("Soma dos livros é: R$ %.2f",LivroDB.valorSomaLivros()));
		System.out.println(String.format("Média dos livros é: R$ %.2f",LivroDB.valorMediaLivros()));
	}
	
	public static void script9(){
		System.out.println("*** script 9 ***");
		Assinatura a1 = new Assinatura("a222", LocalDate.of(2016, 2, 10), LocalDate.of(2016, 10, 10));
		Assinatura a2 = new Assinatura("b222", LocalDate.of(2015, 2, 10), LocalDate.of(2016, 2, 10));
		Assinatura a3 = new Assinatura("c222", LocalDate.of(2016, 2, 10), LocalDate.now());
		a1.validarAssinatura();
		a2.validarAssinatura();
		a3.validarAssinatura();
	}
	
	public static void script10(){
		
	}

}
