public class Vehicle {
    static double registrationFee = 5000.0;

    private final String registrationNumber; // Final
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + this.ownerName);
            System.out.println("Type: " + this.vehicleType);
            System.out.println("Registration No: " + this.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}
