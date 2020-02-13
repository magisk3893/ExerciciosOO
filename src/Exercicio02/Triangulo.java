package Exercicio02;

public class Triangulo {
    private double base;
    private double altura;
    private double resultado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.resultado=(base*altura)/2;

        System.out.println(resultado);


    }
}
