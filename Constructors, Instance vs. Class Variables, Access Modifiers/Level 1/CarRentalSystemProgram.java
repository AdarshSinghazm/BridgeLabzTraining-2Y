class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
    
    // Default constructor
    public CarRental() {
        this("Customer", "Compact Car", 1, 50.0);
    }
    
    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    
    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }
    
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    
    public void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
    
    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            dailyRate = dailyRate * (1 - discountPercent / 100);
            System.out.println("Applied " + discountPercent + "% discount. New daily rate: $" + dailyRate);
        }
    }
}

public class CarRentalSystemProgram {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Alice Johnson", "SUV", 5, 80.0);
        CarRental rental3 = new CarRental(rental2); // Copy constructor
        
        System.out.println("Default Rental:");
        rental1.displayRentalDetails();
        
        System.out.println("\nParameterized Rental:");
        rental2.displayRentalDetails();
        
        System.out.println("\nCopied Rental:");
        rental3.displayRentalDetails();
        
        // Apply discount and modify copy
        rental3.customerName = "Bob Smith";
        rental3.applyDiscount(10.0);
        
        System.out.println("\nAfter discount and modification:");
        rental3.displayRentalDetails();
        
        System.out.println("\nOriginal rental remains unchanged:");
        rental2.displayRentalDetails();
    }
}