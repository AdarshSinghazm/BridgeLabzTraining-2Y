import java.util.*;

// ----------------- Abstract Class -----------------
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation (getters/setters with validation)
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) this.baseSalary = baseSalary;
    }

    // Abstract + Polymorphism
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                ", Base Salary: " + baseSalary);
    }
}

// ----------------- Subclasses -----------------
class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(int id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Abhishek", 20000, 5000));
        employees.add(new PartTimeEmployee(2, "Priya", 5000, 20, 200));

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Final Salary: " + e.calculateSalary());
            System.out.println("----");
        }
    }
}
