import java.util.*;

// ----------------- Faculty -----------------
class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Faculty: " + name);
    }
}

// ----------------- Department -----------------
class Department1 {
    String deptName;
    List<String> employees = new ArrayList<>();

    Department1(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String emp) {
        employees.add(emp);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (String emp : employees) {
            System.out.println(" - " + emp);
        }
    }
}

// ----------------- University -----------------
class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {  // Composition
        departments.add(d);
    }

    void addFaculty(Faculty f) {  // Aggregation
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.show();

        System.out.println("Departments:");
        for (Department d : departments) d.showDepartment();
    }
}

public class UniversityWithFaculties {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        // Faculties (Aggregation: can exist independently)
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Gupta");

        // Departments (Composition: tied to University)
        Department1 d1 = new Department1("Computer Science");
        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        Department1 d2 = new Department1("Physics");
        d2.addEmployee("Charlie");

        uni.addFaculty(f1);
        uni.addFaculty(f2);
        
        uni.showUniversity();
    }

}
