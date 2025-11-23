public class LibraryBook {
    public String ISBN;
    protected String title;
    private String author;

    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("12345", "Java Basics", "James");
        ebook.displayInfo();
        ebook.setAuthor("Gosling");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

class EBook extends LibraryBook {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayInfo() {
        System.out.println("EBook ISBN: " + ISBN + " | Title: " + title);
    }

}
