public class ProductInventory {
    String productName;        // instance variable
    double price;               // instance variable
    static int totalProducts = 0;  // class variable

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + " | Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 55000);
        ProductInventory p2 = new ProductInventory("Mouse", 700);

        p1.displayProductDetails();
        p2.displayProductDetails();

        ProductInventory.displayTotalProducts();
    }

}
