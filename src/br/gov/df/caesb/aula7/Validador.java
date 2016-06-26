package br.gov.df.caesb.aula7;

@FunctionalInterface
public interface Validador<T> {
	Boolean valida(T t);
}
