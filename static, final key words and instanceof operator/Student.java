public class Student {
    private static String universityName = "State University";
    private static int totalStudents = 0;
    
    private final String rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public static String getUniversityName() {
        return universityName;
    }
    
    public static int displayTotalStudents() {
        return totalStudents;
    }
    
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    
    public static boolean isValidStudent(Object obj) {
        return obj instanceof Student;
    }
}