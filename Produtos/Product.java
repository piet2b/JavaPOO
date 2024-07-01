package Produtos;

public class Product {
    protected String name;
    protected double price;
    private int id_product;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id_product;
    }

    public void setId(int id) {
        this.id_product = id;
    }

    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(double price, String name) {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}
