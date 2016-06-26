package br.gov.df.caesb.projeto1.datas;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class Assinatura {
	private String assinatura;
	private LocalDate dataInicio;
	private LocalDate dataFinal;

	public Assinatura(String assinatura, LocalDate dataInicio, LocalDate dataFinal) {
		this.assinatura = assinatura;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	public String getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public void validarAssinatura() {
		LocalDate hoje = LocalDate.now();

		if (hoje.isBefore(dataFinal)) {
			long periodo = DAYS.between(hoje, dataFinal);
			System.out
					.println(String.format("Faltam %d dias para o encerramento da assinatura %s", periodo,assinatura));
		} else if (hoje.isAfter(dataFinal)) {
			long periodo = DAYS.between(dataFinal, hoje);
			System.out.println(String.format("A assinatura %s se encerrou a %d dias",assinatura, periodo));
		} else {
			System.out.println("Sua assinatura se encerra hoje");
		}
	}
}
