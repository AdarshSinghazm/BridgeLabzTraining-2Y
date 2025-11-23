public class CircleInfo {
    double radius;

    public CircleInfo() {
        this(1.0);  // Constructor chaining
    }

    public CircleInfo(double radius) {
        this.radius = radius;
    }

    public void displayCircle() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        CircleInfo defaultCircle = new CircleInfo();
        CircleInfo customCircle = new CircleInfo(5.0);

        System.out.println("Default Circle:");
        defaultCircle.displayCircle();

        System.out.println("\nCustom Circle:");
        customCircle.displayCircle();
    }

}
