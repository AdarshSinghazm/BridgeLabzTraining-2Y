class Circle {
    double radius;
    
    // Default constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor with default value
    }
    
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", calculateCircumference()));
    }
}

public class CircleConstructorChainingProgram {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(7.5);
        
        circle1.displayDetails();
        System.out.println();
        circle2.displayDetails();
        System.out.println();
        circle3.displayDetails();
    }
}