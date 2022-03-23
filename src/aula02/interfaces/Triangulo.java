package aula02.interfaces;

public class Triangulo implements FormaGeometrica{

    private long base;
    private long altura;

    public Triangulo(long base, long altura){}

    @Override
    public long calculaArea() {
        return base * altura / 2;
    }
}
