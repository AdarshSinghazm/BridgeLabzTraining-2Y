class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;
    
    // Default constructor
    public LibraryBook() {
        this("Unknown", "Unknown", 0.0, true);
    }
    
    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been borrowed successfully.");
        } else {
            System.out.println("Sorry, book '" + title + "' is already borrowed.");
        }
    }
    
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book '" + title + "' has been returned successfully.");
        } else {
            System.out.println("Book '" + title + "' was not borrowed.");
        }
    }
    
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
    }
}

public class LibraryBookSystemProgram {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook("The Hobbit", "J.R.R. Tolkien", 15.99, true);
        LibraryBook book3 = new LibraryBook("Harry Potter", "J.K. Rowling", 12.99, false);
        
        book1.displayBookDetails();
        System.out.println();
        
        book2.displayBookDetails();
        book2.borrowBook();
        book2.borrowBook(); // Try to borrow again
        book2.displayBookDetails();
        System.out.println();
        
        book3.displayBookDetails();
        book3.returnBook();
        book3.borrowBook();
        book3.displayBookDetails();
    }
}