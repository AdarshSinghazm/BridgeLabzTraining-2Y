public class EmployeeRecords {
    public int employeeID;
    protected String department;
    private double salary;

    public EmployeeRecords(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Manager m = new Manager(101, "IT", 75000, "Project Manager");
        m.displayDetails();
        m.setSalary(85000);
        System.out.println("Salary Updated!");
    }
}

class Manager extends EmployeeRecords {
    String designation;

    public Manager(int employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + " | Dept: " + department + " | Designation: " + designation);
    }

}
