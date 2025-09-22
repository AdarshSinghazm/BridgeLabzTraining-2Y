class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    double rate;
    
    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1, 100.0);
    }
    
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights, double rate) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        this.rate = rate;
    }
    
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        this.rate = other.rate;
    }
    
    public double calculateTotalCost() {
        return nights * rate;
    }
    
    public void displayBookingDetails() {
        System.out.println("Hotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Rate per night: $" + rate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class HotelBookingSystemProgram {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3, 150.0);
        HotelBooking booking3 = new HotelBooking(booking2); // Copy constructor
        
        System.out.println("Default Booking:");
        booking1.displayBookingDetails();
        
        System.out.println("\nParameterized Booking:");
        booking2.displayBookingDetails();
        
        System.out.println("\nCopied Booking:");
        booking3.displayBookingDetails();
        
        // Modify the copy
        booking3.guestName = "Jane Smith";
        booking3.nights = 2;
        
        System.out.println("\nAfter modifying copied booking:");
        booking3.displayBookingDetails();
    }
}