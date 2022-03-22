package aula02.interfaces;

public interface FormaGeometrica {

    long calculaArea();


    default void print(){
        System.out.println("Calculo da area: " + calculaArea());
    }
}
