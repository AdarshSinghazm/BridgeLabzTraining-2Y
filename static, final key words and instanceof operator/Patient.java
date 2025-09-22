public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    
    public static String getHospitalName() {
        return hospitalName;
    }
    
    public static int getTotalPatients() {
        return totalPatients;
    }
    
    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
    
    public static boolean isValidPatient(Object obj) {
        return obj instanceof Patient;
    }
}