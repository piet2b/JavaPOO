package InterfacesGraficas;

public class Triangulo extends Forma {

    private double lado;
    private double base;
    private double altura;

    public Triangulo(String cor, double lado, double base, double altura) {
        super(cor);
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

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
}