import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;
    
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double getTotalCost() {
        return price * quantity;
    }
    
    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalCost());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println("Added: " + itemName + " (Quantity: " + quantity + ")");
    }
    
    public void removeItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                CartItem removed = items.remove(i);
                System.out.println("Removed: " + removed.itemName);
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }
    
    public double calculateTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalCost();
        }
        return total;
    }
    
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty!");
            return;
        }
        
        System.out.println("Shopping Cart Contents:");
        System.out.println("-----------------------");
        for (CartItem item : items) {
            item.displayItem();
        }
        System.out.println("-----------------------");
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class ShoppingCartProgram {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addItem("Laptop", 999.99, 1);
        cart.addItem("Mouse", 25.50, 2);
        cart.addItem("Keyboard", 75.00, 1);
        
        System.out.println();
        cart.displayCart();
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        cart.removeItem("Mouse");
        cart.addItem("Headphones", 150.00, 1);
        
        System.out.println();
        cart.displayCart();
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        cart.removeItem("Tablet");
        cart.removeItem("Laptop");
        
        System.out.println();
        cart.displayCart();
    }
}