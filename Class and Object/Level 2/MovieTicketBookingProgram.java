class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;
    
    public MovieTicket(String movieName, double basePrice) {
        this.movieName = movieName;
        this.price = basePrice;
        this.isBooked = false;
        this.seatNumber = 0;
    }
    
    public void bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            
            if (seatNumber >= 1 && seatNumber <= 10) {
                price += 5.0;
            } else if (seatNumber >= 11 && seatNumber <= 20) {
                price += 3.0;
            }
            
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked!");
        }
    }
    
    public void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            seatNumber = 0;
            price = price - (price > 0 ? 2.0 : 0);
            System.out.println("Ticket cancelled successfully!");
        } else {
            System.out.println("No ticket to cancel!");
        }
    }
    
    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + (isBooked ? seatNumber : "Not assigned"));
        System.out.println("Price: $" + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }
}

public class MovieTicketBookingProgram {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", 12.99);
        MovieTicket ticket2 = new MovieTicket("The Batman", 10.99);
        
        ticket1.displayTicketDetails();
        System.out.println();
        
        ticket1.bookTicket(5);
        ticket1.displayTicketDetails();
        System.out.println();
        
        ticket1.bookTicket(15);
        System.out.println();
        
        ticket2.displayTicketDetails();
        ticket2.bookTicket(18);
        ticket2.displayTicketDetails();
        System.out.println();
        
        ticket1.cancelTicket();
        ticket1.displayTicketDetails();
    }
}