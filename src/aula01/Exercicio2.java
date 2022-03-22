package aula01;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("Exercicio 2");
        System.out.println("Qual a data/hora neste instante no fuso de Portugal?");

        System.out.println("Seu fuso-horário:");
        var zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow.format(DateTimeFormatter.ofPattern("EEE, dd/L/y - HH:mm:ss VV")));
        System.out.println("Data e Hora neste instante em Portugal");
        var zonedDateTimeSameInstant = zonedDateTimeNow.withZoneSameInstant(ZoneId.of("Portugal"));
        System.out.println(zonedDateTimeSameInstant.format(DateTimeFormatter.ofPattern("EEE, dd/L/y - HH:mm:ss VV")));


    }
}
