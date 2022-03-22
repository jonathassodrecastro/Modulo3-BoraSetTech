package aula01;

import org.w3c.dom.ls.LSOutput;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercicio4 {
    public static void main(String[] args) {
        String de= " de ";
        System.out.println("Exercicio 1");
        System.out.println("Formatar uma data no seguinte padrão: '19:00:00, 17 de março de 2022 (fuso: -03:00)'");
        var zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss, d MMMM y (xxxx)")));
    }
}
