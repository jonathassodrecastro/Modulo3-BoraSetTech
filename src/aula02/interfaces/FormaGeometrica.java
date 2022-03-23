package aula02.interfaces;

@FunctionalInterface
public interface FormaGeometrica {


    long calculaArea();

    default void print(){
        System.out.println("Calculo da area: " + calculaArea());
    }
}
