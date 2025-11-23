import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}
public class Company_Departments {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Charlie"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompany();
        // When Company object is destroyed, departments & employees also go away → composition
    }
}
