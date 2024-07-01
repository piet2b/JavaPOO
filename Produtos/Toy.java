package Produtos;

public class Toy extends Product {

    public Toy(double price, String name) {
        super(price, name);
    }

    @Override
    public void update(String name, double price) {
        super.update(name, price);
        System.out.println("Toy updated: " + name + " with price: " + price);
    }

    @Override
    public void showInfo(double price, String name) {
        System.out.println("Toy Information:");
        super.showInfo(price, name);
    }
}
