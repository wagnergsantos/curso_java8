package br.gov.df.caesb.java8.usos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.gov.df.caesb.java8.Usuario;

public class ExemploFor {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("A",1);
		Usuario u2 = new Usuario("B",2);
		Usuario u3 = new Usuario("C",3);
		
		List<Usuario> usuarios = Arrays.asList(u1,u2,u3);
		
		//formato antigo do for
		for (Usuario usuario : usuarios) {
			System.out.println(" Antigo: "+usuario.getNome());
		}
		
		//uso de forEach verboso com classe externa
		usuarios.forEach(new Mostrador());
		
		
		//uso de forEach verboso com classe anonima
		usuarios.forEach(new Consumer<Usuario>() {
			@Override
			public void accept(Usuario usuario) {
				System.out.println("Verb.CA: "+usuario.getNome());
			}			
		});
		
		//exemplo de lambda usando a 'interface funcional'
		Consumer<Usuario> mostrador = u -> System.out.println("Lambda1: "+u.getNome());
		usuarios.forEach(mostrador);
		

		//uso de forEach lambda2
		usuarios.forEach(u -> System.out.println("Lambda2: "+u.getNome()));
	}
	
	public static class Mostrador implements Consumer<Usuario> {

		@Override
		public void accept(Usuario usuario) {
			System.out.println("Verb.CE: "+usuario.getNome());			
		}
		
	}

}
