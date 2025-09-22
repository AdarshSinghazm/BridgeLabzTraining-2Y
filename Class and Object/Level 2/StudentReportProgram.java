class Student {
    String name;
    int rollNumber;
    double marks;
    
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public char calculateGrade() {
        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        return 'F';
    }
    
    public void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReportProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", 101, 85.5);
        Student student2 = new Student("Bob Smith", 102, 92.0);
        Student student3 = new Student("Carol Davis", 103, 67.8);
        
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        student3.displayDetails();
    }
}