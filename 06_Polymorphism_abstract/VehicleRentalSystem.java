import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rentalRate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println(type + " [" + vehicleNumber + "] Rate/day: " + rentalRate);
    }
}

class Car extends Vehicle {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return (getRentalRate() * days) - 50; }
}

class Truck extends Vehicle {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days + 500; }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Car("C123", 1500),
                new Bike("B456", 500),
                new Truck("T789", 2500)
        );

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental cost (5 days): " + v.calculateRentalCost(5));
            System.out.println("----");
        }
    }

}
