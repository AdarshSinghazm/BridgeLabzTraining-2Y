import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int id, String name, int age, int days, double rate) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyRate = rate;
    }

    @Override public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override public double calculateBill() {
        return consultationFee;
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new InPatient(1, "Abhishek", 25, 5, 2000),
                new OutPatient(2, "Priya", 30, 500)
        );

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            System.out.println("----");
        }
    }
}

