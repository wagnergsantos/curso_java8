package br.gov.df.caesb.projeto1.livraria;

import java.util.Scanner;

import br.gov.df.caesb.projeto1.livraria.db.LivroDB;
import br.gov.df.caesb.projeto1.livraria.entidades.CarrinhoDeCompras;
import br.gov.df.caesb.projeto1.livraria.entidades.Logar;

public class Comprar {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o login: ");
		Integer login = sc.nextInt();
		if(Logar.efetuarLogin(login)){
			CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
			carrinhoDeCompras.addProduto(2, LivroDB.findLivroByName("Gerador Arc"));
			carrinhoDeCompras.addProduto(1, LivroDB.findLivroByName("Liga da Justiça"));
			carrinhoDeCompras.addProduto(3, LivroDB.findLivroByName("Sonho meu"));
			System.out.println(carrinhoDeCompras.getTotal());
		} else {
			System.out.println("Digite um login válido");
		}
		
	}

}
