public class MobilePhoneDetails {
    String brand;
    String model;
    double price;

    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhoneDetails m = new MobilePhoneDetails("Samsung", "Galaxy S23", 75000.0);
        m.displayDetails();
    }

}
