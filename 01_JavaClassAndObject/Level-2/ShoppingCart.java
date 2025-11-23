public class ShoppingCart {
    String itemName;
    double price;
    int quantity;

    public ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Not enough quantity to remove.");
        }
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        ShoppingCart c = new ShoppingCart("Pen", 10.0, 5);
        c.addItem(3);
        c.removeItem(2);
        c.displayTotalCost();
    }

}
