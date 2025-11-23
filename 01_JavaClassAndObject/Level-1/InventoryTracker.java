public class InventoryTracker {
    int itemCode;
    String itemName;
    double price;

    public InventoryTracker(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        InventoryTracker i = new InventoryTracker(101, "Notebook", 50.0);
        i.displayItem(10);
    }

}
