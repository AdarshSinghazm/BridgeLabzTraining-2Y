class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }
    void displayInfo() {
        System.out.println("Book: " + title + ", Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + " | Bio: " + bio);
    }
}
public class LibraryTest {
    public static void main(String[] args) {
        Author a = new Author("Java Programming", 2023, "James Gosling", "Father of Java");
        a.displayInfo();
    }
    // Based on Single Inheritance !
}
