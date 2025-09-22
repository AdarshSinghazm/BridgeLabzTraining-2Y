class MobilePhone {
    String brand;
    String model;
    double price;
    
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class MobilePhoneProgram {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 899.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 999.99);
        MobilePhone phone3 = new MobilePhone("Google", "Pixel 7", 599.99);
        
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
        System.out.println();
        phone3.displayDetails();
    }
}