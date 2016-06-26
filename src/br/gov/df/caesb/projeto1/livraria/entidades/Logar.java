package br.gov.df.caesb.projeto1.livraria.entidades;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import br.gov.df.caesb.projeto1.livraria.Comprar;

public class Logar {
	private static File getCaminho(){
		ClassLoader classLoader = Comprar.class.getClassLoader();
	    File classpathRoot = new File(classLoader.getResource("").getPath());
	    return new File(classpathRoot.getParent(),"listacodigos.txt");
	}
	
	public static Boolean efetuarLogin(Integer login){
		try (IntStream stream = Files.lines(Paths.get(getCaminho().toURI())).mapToInt(s -> Integer.valueOf(s))) {

			return stream.anyMatch(i -> login == i);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
}
