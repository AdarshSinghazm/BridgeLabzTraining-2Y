class Person {
    String name;
    int age;
    String email;
    
    // Parameterized constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.email = other.email;
    }
    
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

public class PersonCopyConstructorProgram {
    public static void main(String[] args) {
        Person person1 = new Person("Alice Johnson", 25, "alice@email.com");
        Person person2 = new Person(person1); // Using copy constructor
        
        System.out.println("Original Person:");
        person1.displayDetails();
        
        System.out.println("\nCopied Person:");
        person2.displayDetails();
        
        // Modify the copy to show they are separate objects
        person2.name = "Bob Smith";
        person2.age = 30;
        person2.email = "bob@email.com";
        
        System.out.println("\nAfter modification:");
        System.out.println("Original Person:");
        person1.displayDetails();
        System.out.println("\nCopied Person (modified):");
        person2.displayDetails();
    }
}