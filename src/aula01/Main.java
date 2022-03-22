package aula01;


import java.time.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

//        System.out.println("LocalDate.now(): " + LocalDate.now());
//        System.out.println("LocalDate.of(): "+ LocalDate.of(2021, Month.APRIL, 17));
//        System.out.println("LocalDateTime.now(): " + LocalDateTime.now());
//        //Representar a data em uma forma numérica inteira tendo como dia 0 o dia 01/01/1970
//        System.out.println("EpochDay: "+ LocalDate.ofEpochDay(950));
//
//
//        //sortear data desse mes
//        System.out.println("Data sorteada dentro de um range");
//        LocalDate dataInicial = LocalDate.of(2022, 3, 1);
//        LocalDate dataFinal = LocalDate.of(2022, 3, 31);
//
//        long dataInicialEpoch = dataInicial.toEpochDay();
//        long dataFinalEpoch = dataFinal.toEpochDay();
//
//        long dataSorteadaEpoch = ThreadLocalRandom.current().nextLong(dataInicialEpoch, dataFinalEpoch + 1);
//        LocalDate localDate =  LocalDate.ofEpochDay(dataSorteadaEpoch);
//
//        System.out.println("Data Sorteada: " + localDate);

        System.out.println("Aplicacao LocalTime");
        System.out.println("LocalTime.now() " + LocalTime.now());

        System.out.println("LocalDateTime.now(): " + LocalDateTime.now());
        System.out.println("LocalDate.now(): " + LocalDate.now());

        System.out.println("ZonedDateTime: " + ZonedDateTime.now());

    }
}
