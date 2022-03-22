package aula01;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercícios aula 1:");
        System.out.println("01 - Qual sua idade em segundos até o presente momento?");

        LocalDateTime hoje = LocalDateTime.now();

        System.out.println("Informe o seu dia de Nascimento:");
        int dia = scanner.nextInt();
        System.out.println("Informe o seu mês de Nascimento:");
        int mes = scanner.nextInt();
        System.out.println("Informe o seu ano de Nascimento:");
        int ano = scanner.nextInt();
        System.out.println("Informe a hora de Nascimento:");
        int hora = scanner.nextInt();
        System.out.println("Informe o minuto do horário de Nascimento:");
        int minuto = scanner.nextInt();

        LocalDateTime dataFormatada = LocalDateTime.of(ano, mes, dia, hora, minuto);

       long diferencaSegundos = dataFormatada.until(hoje, ChronoUnit.SECONDS);

        System.out.println("Você viveu " + diferencaSegundos + " segundos até a execução desse programa");
    }
}
