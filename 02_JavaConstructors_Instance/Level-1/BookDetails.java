public class BookDetails {
    String title;
    String author;
    double price;

    // Default constructor
    public BookDetails() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        BookDetails defaultBook = new BookDetails();
        BookDetails customBook = new BookDetails("Java Basics", "John Doe", 499.99);

        System.out.println("Default Book:");
        defaultBook.displayBook();

        System.out.println("\nCustom Book:");
        customBook.displayBook();
    }

}
