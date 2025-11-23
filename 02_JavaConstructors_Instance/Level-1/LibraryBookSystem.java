public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: ₹" + price + " | Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBookSystem book = new LibraryBookSystem("Java Programming", "James Gosling", 799.99);
        book.displayBook();
        book.borrowBook();
        book.displayBook();
        book.borrowBook();
    }

}
