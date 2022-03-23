package aula02.interfaces;

public class Main {
    public static void main(String[] args) {
        new Quadrado(2);
        FormaGeometrica formaGeometrica = new FormaGeometrica() {
            @Override
            public long calculaArea() {
                return 100;
            }
        };
    }
}
