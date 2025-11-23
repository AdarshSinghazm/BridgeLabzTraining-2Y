public class PersonInfo {
    String name;
    int age;

    public PersonInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public PersonInfo(PersonInfo other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonInfo original = new PersonInfo("Alice", 25);
        PersonInfo copied = new PersonInfo(original);

        System.out.println("Original Person:");
        original.displayPerson();

        System.out.println("\nCopied Person:");
        copied.displayPerson();
    }

}
