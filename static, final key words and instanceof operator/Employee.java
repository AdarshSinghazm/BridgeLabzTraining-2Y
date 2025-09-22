public class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    
    private final String id;
    private String name;
    private String designation;
    
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    
    public static String getCompanyName() {
        return companyName;
    }
    
    public static int displayTotalEmployees() {
        return totalEmployees;
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
    
    public static boolean isValidEmployee(Object obj) {
        return obj instanceof Employee;
    }
}