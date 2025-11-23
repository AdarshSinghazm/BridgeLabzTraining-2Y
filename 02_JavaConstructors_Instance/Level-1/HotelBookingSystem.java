public class HotelBookingSystem {

    String guestName;
    String roomType;
    int nights;

    public HotelBookingSystem() {
        this("Unknown", "Standard", 1);
    }

    public HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBookingSystem(HotelBookingSystem other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBookingSystem defaultBooking = new HotelBookingSystem();
        HotelBookingSystem customBooking = new HotelBookingSystem("John", "Deluxe", 3);
        HotelBookingSystem copiedBooking = new HotelBookingSystem(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println("\nCustom Booking:");
        customBooking.displayBooking();

        System.out.println("\nCopied Booking:");
        copiedBooking.displayBooking();
    }

}
