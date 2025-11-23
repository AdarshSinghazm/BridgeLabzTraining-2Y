public class Student {
    static String universityName = "Delhi University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;  // Final
    private String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + this.name);
            System.out.println("Roll No: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        }
    }
}
