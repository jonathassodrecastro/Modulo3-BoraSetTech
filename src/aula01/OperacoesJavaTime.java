package aula01;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class OperacoesJavaTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        LocalDate now = LocalDate.now();
//        System.out.println("Dia de hoje: " + now);
//        LocalDate nowPlus10 =  LocalDate.now().plusDays(10);
//        System.out.println("Mais 10 dias: " + nowPlus10);
//
//        long valorSoma;
//        System.out.println("Quantas horas você quer somar?");
//        valorSoma = scanner.nextLong();
//
//        LocalDateTime agora = LocalDateTime.now();
//        LocalDateTime agoraSomado = agora.plusHours(valorSoma);
//        System.out.println("Agora: " + agora + " Somado: " + agoraSomado);

//        //pegar diferença entre duas datas, tendo uma como agora e a outra é o Primeiro dia do mês
//        LocalDateTime diaHoje = LocalDateTime.now();
//        LocalDateTime primeiroDiaDoMes = diaHoje.with(TemporalAdjusters.firstDayOfMonth());
//        LocalDateTime primeiroDiaProximoMes = diaHoje.with(TemporalAdjusters.firstDayOfNextMonth());
//
//        long diffDias = primeiroDiaDoMes.until(diaHoje, ChronoUnit.DAYS);
//        System.out.println("Primeiro dia do mês: " + primeiroDiaDoMes);
//        System.out.println("Hoje: " + diaHoje);
//        System.out.println("Diferença entre dia Primeiro e hoje: " + diffDias + " dias");
//        diffDias = primeiroDiaProximoMes.until(diaHoje, ChronoUnit.DAYS);
//        System.out.println("Diferença entre dia hoje e o dia primeiro do próximo mês : " + diffDias + " dias");
////        //Retorna true ou false
//        System.out.println(diaHoje.isAfter(primeiroDiaProximoMes));
//
////        //Só converte o fuso, mas mostra hora local
//        System.out.println(ZonedDateTime.now().withZoneSameLocal(ZoneId.of("Etc/GMT")));
//        //Converte o fuso e retorna hora do local do fuso
//        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Etc/GMT")));
//
//        var zonedDateTimeNow = ZonedDateTime.now();
//        var zonedDateTimeSameInstant = zonedDateTimeNow.withZoneSameInstant(ZoneId.of("Etc/GMT"));
//        System.out.println("Horario local - " + zonedDateTimeNow);
//        System.out.println("Horario outro fuso - " + zonedDateTimeSameInstant);
//        System.out.println("Diferença de horas igual a  - "
//                + zonedDateTimeNow.until(zonedDateTimeSameInstant, ChronoUnit.HOURS) + " Porque é o mesmo horário" +
//                "em horas diferentes");
//        System.out.println("usando offset pra retornar só a diferença de horário");
//        System.out.println(zonedDateTimeNow.toOffsetDateTime());
//
//        //adaptações
//        LocalDate proximaSexta = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
//        System.out.println("Proxima Sexta: " + proximaSexta);
//
//        LocalDate prox = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
//        System.out.println("Se é quarta, retorna o dia, se não, retorna a próxima quarta: " + prox);

        //Formatações
        var dia = ZonedDateTime.now();
        System.out.println(dia);
        System.out.println("\n\n\n\n\nFormatação: EEE, dd/L/y - HH:mm:ss VV");
        System.out.println(dia.format(DateTimeFormatter.ofPattern("EEE, dd/L/y - HH:mm:ss VV")));
        System.out.println("Formatação: e, d/L/y - hh:mm:ss VV");
        System.out.println(dia.format(DateTimeFormatter.ofPattern("e, d/L/y - hh:mm:ss VV")));
        System.out.println("Formatação: cccc, D/M/yyyy - HH:mm:ss zz");
        System.out.println(dia.format(DateTimeFormatter.ofPattern("cccc, d/M/yyyy - HH:mm:ss zz")));
        System.out.println("Formatação: cccc, DD/M/yyyy - HH:mm:ss zz");
        System.out.println(dia.format(DateTimeFormatter.ofPattern("cccc, dd/M/yyyy - HH:mm:ss zz")));
        System.out.println("Formatação: FormatStyle.FULL");
        System.out.println(dia.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("Formatação: FormatStyle.LONG");
        System.out.println(dia.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Formatação: FormatStyle.MEDIUM");
        System.out.println(dia.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Formatação: FormatStyle.SHORT");
        System.out.println(dia.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        //objeto que quero parsear
//        OffsetDateTime data1 = OffsetDateTime.parse("2022-03-13_19_01_45_+03:00", DateTimeFormatter.ofPattern("Y-MM-dd_HH_mm_ss_xxx"));
//        OffsetDateTime data2 = OffsetDateTime.parse("2022-03-13T19:01:45.768149722+03:00");
//        System.out.println("Data 1: " + data1);
//        System.out.println("Data 2: " + data2);






    }
}
