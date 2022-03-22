package aula01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Exercícios aula 1:");
        System.out.println("01 - Qual sua idade em segundos até o presente momento?");

        LocalDateTime hoje = LocalDateTime.now();


        try {
               System.out.println("Informe o seu dia de Nascimento entre 1 e 31:");
               int dia = scanner.nextInt();
               System.out.println("Informe o seu mês de Nascimento entre 1 e 12:");
               int mes = scanner.nextInt();
               System.out.println("Informe o seu ano de Nascimento:");
               int ano = scanner.nextInt();
               System.out.println("Informe a hora de Nascimento entre 00 e 23:");
               int hora = scanner.nextInt();
               System.out.println("Informe o minuto do horário de Nascimento entre 00 e 59:");
               int minuto = scanner.nextInt();

               LocalDateTime dataFormatada = LocalDateTime.of(ano, mes, dia, hora, minuto);


               long diferencaSegundos = dataFormatada.until(hoje, ChronoUnit.SECONDS);


//            DecimalFormat df = new DecimalFormat("0.##");
//            String dx = df.format(diferencaSegundos);

            System.out.println("Você viveu " + NumberFormat.getIntegerInstance().format(diferencaSegundos) + " segundos até a execução desse programa");


        } catch (InputMismatchException exception) {
            System.out.println("Informe apenas números inteiros para a execução");
        } catch (DateTimeException e){
            System.out.println("Informe o valor dentro do intervalo definido.");
        }

    }
}
