public class VehicleRegistration {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + " | Vehicle: " + vehicleType + " | Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        VehicleRegistration v1 = new VehicleRegistration("Alice", "Car");
        v1.displayVehicleDetails();

        VehicleRegistration.updateRegistrationFee(2000);
        VehicleRegistration v2 = new VehicleRegistration("Bob", "Bike");
        v2.displayVehicleDetails();
    }
}
