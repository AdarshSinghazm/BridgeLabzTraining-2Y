class Item {
    String itemCode;
    String itemName;
    double price;
    
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: $" + price);
    }
    
    public void displayOrderDetails(int quantity) {
        displayDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost(quantity));
    }
}

public class InventoryTrackingProgram {
    public static void main(String[] args) {
        Item item1 = new Item("ITM001", "Laptop", 999.99);
        Item item2 = new Item("ITM002", "Mouse", 25.50);
        
        item1.displayDetails();
        System.out.println();
        item1.displayOrderDetails(3);
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        item2.displayDetails();
        System.out.println();
        item2.displayOrderDetails(10);
    }
}