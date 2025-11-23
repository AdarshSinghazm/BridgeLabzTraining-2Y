public class MovieTicketBooking {
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicketBooking t = new MovieTicketBooking();
        t.bookTicket("Avengers", 12, 250.0);
        t.displayTicket();
    }
}
