package aula02.interfaces;

public class Quadrado implements FormaGeometrica{

    private long lado;

    @Override
    public long calculaArea() {
        return (long) Math.pow(lado, 2);
    }


}