package br.gov.df.caesb.avaliacao1;

import static br.gov.df.caesb.avaliacao1.TipoProcesso.CIVEL;
import static br.gov.df.caesb.avaliacao1.TipoProcesso.TRABALHISTA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class AcompanharProcesso {
	public static void main(String[] args) {
		LocalDate dataAgora = LocalDate.now();
		LocalTime horaAgora = LocalTime.now();
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		Processo p1 = new Processo(1, "1111-11.11", CIVEL);
		Andamento a1p1 = new Andamento(1,
				Date.from(dataAgora.minusDays(10).atStartOfDay(ZoneId.systemDefault()).toInstant()));
		Andamento a2p1 = new Andamento(2,
				Date.from(dataAgora.minusDays(22).atStartOfDay(ZoneId.systemDefault()).toInstant()));
		Andamento a3p1 = new Andamento(3,
				Date.from(dataAgora.minusDays(20).atStartOfDay(ZoneId.systemDefault()).toInstant()));
		p1.adicionaAndamento(a1p1);
		p1.adicionaAndamento(a3p1);
		p1.adicionaAndamento(a2p1);
		Processo p2 = new Processo(2, "2222-22.222", TRABALHISTA);
		Processo p3 = new Processo(3, "3", TRABALHISTA);
		Processo p4 = new Processo(4, "4444-44.444", CIVEL);
		Processo p5 = new Processo(5, "5555-55.555", TRABALHISTA);
		Processo p6 = new Processo(6, "6", CIVEL);
		Processo p7 = new Processo(7, "7", CIVEL);
		Processo p8 = new Processo(8, "8", TRABALHISTA);
		Processo p9 = new Processo(9, "9999-99.999", TRABALHISTA);

		List<Processo> processos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);

		Validador<String> validarProcesso = valor -> valor.matches("[0-9]{4}-[0-9]{2}.[0-9]{3}");

		System.out.println("**** lista processos ****");
		processos.forEach(System.out::println);

		System.out.println("**** lista processos números válidos ****");
		processos.stream().filter(p -> validarProcesso.valida(p.getNumero())).forEach(System.out::println);
		
		Map<TipoProcesso,List<Processo>> processoPorTipo = processos.stream().collect(Collectors.groupingBy(Processo::getTipoProcesso));
		processoPorTipo.forEach((k,v) -> System.out.println(k + " = " +v ));
		
		ZonedDateTime proximaSexta = ZonedDateTime.now();
		
		System.out.println(proximaSexta.format(DateTimeFormatter.ISO_ZONED_DATE_TIME.withLocale(new Locale("pt", "br"))));
		
		System.out.println(dataAgora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(horaAgora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
			
		System.out.println(dataHoraAgora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(dataHoraAgora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		System.out.println(dataHoraAgora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
		
	}
}
