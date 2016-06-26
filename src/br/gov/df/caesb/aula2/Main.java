package br.gov.df.caesb.aula2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Trabalhador> trabalhadores = new ArrayList<>();
		
		Trabalhador base = new TrabalhadorBase("Fernando", "Alonso", BigDecimal.valueOf(1500));
		trabalhadores.add(base);		
		Trabalhador chefe = new TrabalhadorChefe("Wagner", "Santos", BigDecimal.valueOf(1500));
		trabalhadores.add(chefe);
		Trabalhador comissionado = new TrabalhadorComissao("Ana", "Julia", BigDecimal.valueOf(4000), BigDecimal.valueOf(40), 48);
		trabalhadores.add(comissionado);		
		Trabalhador horista = new TrabalhadorHorista("Beto", "Barbosa", BigDecimal.valueOf(11), 122);
		trabalhadores.add(horista);
		Trabalhador produtivista = new TrabalhadorProducao("Alberto", "Roberto", BigDecimal.valueOf(8), 230);
		trabalhadores.add(produtivista);
		
		trabalhadores.sort((Trabalhador t1,Trabalhador t2)->(t1.getSalario().compareTo(t2.getSalario())));		
		trabalhadores.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		trabalhadores.sort((Trabalhador t1,Trabalhador t2)->(t1.getSalarioMes().compareTo(t2.getSalarioMes())));		
		trabalhadores.forEach(t -> System.out.println(t));
		for (Trabalhador trabalhador : trabalhadores) {
			System.out.println(trabalhador);
		}
		
		System.out.println();
		
		List<Trabalhador>  maisDe2000 = trabalhadores.stream().filter(t -> t.getSalarioMes().compareTo(BigDecimal.valueOf(2000))==1).collect(Collectors.toList());
		maisDe2000.forEach(t -> System.out.println(t));
		
		
	}
}

