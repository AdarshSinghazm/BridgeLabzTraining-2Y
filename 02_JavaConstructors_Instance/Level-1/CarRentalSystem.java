public class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double dailyRate = 1000.0; // sample rate
        return rentalDays * dailyRate;
    }

    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRentalSystem rental = new CarRentalSystem("Alice", "Toyota Innova", 5);
        rental.displayRental();
    }

}
