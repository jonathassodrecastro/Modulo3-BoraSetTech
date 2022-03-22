package aula01;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Exercicio 3");
        System.out.println("Qual a data/hora neste instante no fuso -02:00?");

        System.out.println("Seu fuso-horário:");
        var zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow.format(DateTimeFormatter.ofPattern("EEE, dd/L/y - HH:mm:ss VV")));
        System.out.println("Data e Hora neste instante no fuso -02:00?");
        ZoneOffset zoneOffset = ZoneOffset.of("-02:00");
        OffsetDateTime date = OffsetDateTime.now(zoneOffset);
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEE, dd/L/y - HH:mm:ss")));
    }
}















