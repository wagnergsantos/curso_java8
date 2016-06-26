package br.gov.df.caesb.aula7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;

public class PrincipalContaAgua {
	public static void main(String[] args) {
		ContaAgua c1 = new ContaAgua(1, "Residencial", 80.0);
		ContaAgua c2 = new ContaAgua(2, "Comercial", 1005.0);
		ContaAgua c3 = new ContaAgua(3, "Comercial", 300.0);
		ContaAgua c4 = new ContaAgua(4, "Residencial", 50.0);
		
		List<ContaAgua> contas = Arrays.asList(c1,c2,c3,c4);

		Consumer<ContaAgua> imprimeMensagem = (m -> System.out.println("conta registrada"));
		Consumer<ContaAgua> imprimeConta= System.out::println;				
		contas.forEach(imprimeMensagem.andThen(imprimeConta));	
		
		System.out.println("***Ordenando contas Lambda***");
		contas.sort((co1,co2)->co1.getValor().compareTo(co2.getValor()));
		contas.forEach(imprimeConta);
		
		System.out.println("***Ordenando contas - methods references***");
		contas.sort(Comparator.comparing(ContaAgua::getValor).reversed());
		contas.forEach(imprimeConta);	
		
		System.out.println("***Excluindo contas***");
		
		contas.stream().filter(p -> p.getValor() > 100).forEach(imprimeConta);	
		
		Double faturamento = contas.stream()
				  .mapToDouble(ContaAgua::getValor)
				  .sum();
		
		System.out.println("Faturamento: "+faturamento);
		
		OptionalDouble media = contas.stream()
				  .mapToDouble(ContaAgua::getValor)
				  .average();
				 
		System.out.println("Média: "+media.orElse(0));
	}

}
