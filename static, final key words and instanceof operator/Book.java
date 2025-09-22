public class Book {
    private static String libraryName = "City Library";
    
    private final String isbn;
    private String title;
    private String author;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public static String getLibraryName() {
        return libraryName;
    }
    
    public void displayBookInfo() {
        System.out.println("Library: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    public static boolean isValidBook(Object obj) {
        return obj instanceof Book;
    }
}