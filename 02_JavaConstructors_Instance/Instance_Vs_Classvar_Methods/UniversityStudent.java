public class UniversityStudent {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public UniversityStudent(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.7, "M.Tech");
        pg.displayDetails();
        pg.setCGPA(9.2);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

class PostgraduateStudent extends UniversityStudent {
    String program;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String program) {
        super(rollNumber, name, CGPA);
        this.program = program;
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + " | Name: " + name + " | Program: " + program);
    }
}
