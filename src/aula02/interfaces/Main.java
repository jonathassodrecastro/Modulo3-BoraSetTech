package aula02.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<FormaGeometrica> formaGeometricas = List.of(
                new Quadrado(2),
                new Triangulo(2,3),
                //expressão lambda que cria o método anonimo a partir da interface funcional
                (a) -> 1000
        );

        for(FormaGeometrica formaGeometrica : formaGeometricas){
            System.out.println("Área Calculada: "+formaGeometrica.calculaArea(4));
        }

    }
}
