package br.gov.df.caesb.projeto1.util;

@FunctionalInterface
public interface Validador<T> {
	Boolean valida(T t);
}
