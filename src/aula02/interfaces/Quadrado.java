package aula02.interfaces;

public class Quadrado implements FormaGeometrica{

    protected long lado;

    public Quadrado(long lado){
        this.lado = lado;
    }

    @Override
    public long calculaArea(Integer a) {
        return lado * lado;
    }


}
