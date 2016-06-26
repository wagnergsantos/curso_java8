package br.gov.df.caesb.avaliacao1;

@FunctionalInterface
public interface Validador<T> {
	Boolean valida(T t);
}
