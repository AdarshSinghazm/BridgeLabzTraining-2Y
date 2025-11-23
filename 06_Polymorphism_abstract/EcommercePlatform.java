import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.10; }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.20; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.05; }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Electronics(101, "Laptop", 60000),
                new Clothing(102, "Shirt", 2000),
                new Groceries(103, "Rice", 1000)
        );

        for (Product p : products) {
            p.displayDetails();
            double finalPrice = p.getPrice() - p.calculateDiscount();
            System.out.println("Final Price after discount: " + finalPrice);
            System.out.println("----");
        }
    }
}
