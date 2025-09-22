public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        
        generateNullPointerException();
        handleNullPointerException();
    }
    
    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Attempting to get length of null string...");
        int length = text.length();
    }
    
    public static void handleNullPointerException() {
        String text = null;
        
        try {
            System.out.println("Attempting to get length of null string with exception handling...");
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}