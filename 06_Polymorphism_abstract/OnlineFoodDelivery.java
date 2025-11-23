import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity + " @ " + price);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String n, double p, int q) { super(n, p, q); }
    @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String n, double p, int q) { super(n, p, q); }
    @Override public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra non-veg charge
    }
}
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = Arrays.asList(
                new VegItem("Paneer Tikka", 200, 2),
                new NonVegItem("Chicken Biryani", 300, 1)
        );

        for (FoodItem f : order) {
            f.getItemDetails();
            System.out.println("Total: " + f.calculateTotalPrice());
            System.out.println("----");
        }
    }
}
