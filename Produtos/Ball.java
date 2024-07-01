package Produtos;

public class Ball extends Product {

    public Ball(double price, String name) {
        super(price, name);
    }

    @Override
    public void update(String name, double price) {
        super.update(name, price);
        System.out.println("Ball updated: " + name + " with price: " + price);
    }

    @Override
    public void showInfo(double price, String name) {
        System.out.println("Ball Information:");
        super.showInfo(price, name);
    }
}
