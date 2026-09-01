import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    // Default constructor
    Person() {
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age;
    }
}


class Doctor extends Person {
    protected String specialization;

    // Default constructor
    Doctor() {
    }

    // Parameterized constructor
    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Specialization: " + specialization;
    }
}


class Surgeon extends Doctor {
    private String surgeryType;

    // Default constructor
    Surgeon() {
    }

    // Parameterized constructor
    Surgeon(String name, int age, String specialization,
            String surgeryType) {

        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Surgery Type: " + surgeryType;
    }
}


public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String[] data = sc.nextLine().split(",");

        String name = data[0];
        int age = Integer.parseInt(data[1]);
        String specialization = data[2];
        String surgeryType = data[3];

        // Create Surgeon object
        Surgeon surgeon = new Surgeon(
                name,
                age,
                specialization,
                surgeryType
        );

        // Display output
        System.out.println(surgeon);

        sc.close();
    }
}