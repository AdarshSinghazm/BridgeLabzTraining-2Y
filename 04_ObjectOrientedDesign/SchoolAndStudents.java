import java.util.*;

// ----------------- Course -----------------
class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.name);
        }
    }
}

// ----------------- Student -----------------
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);  // two-way association
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

// ----------------- School -----------------
class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {   // Aggregation: School has Students
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}
public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create School
        School school = new School("Green Valley School");

        // Create Students
        Student s1 = new Student("Abhishek");
        Student s2 = new Student("Priya");

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");

        // Enroll students in courses (Association: Many-to-Many)
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);

        s2.enrollInCourse(science);
        s2.enrollInCourse(english);

        // Show Aggregation
        school.showStudents();

        // Show Association
        s1.showCourses();
        s2.showCourses();

        math.showStudents();
        science.showStudents();
        english.showStudents();
    }

}
