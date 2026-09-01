import java.util.Scanner;

class Employee {
    protected String name;
    protected String id;
    protected double basicSalary;

    // Default constructor
    Employee() {
    }

    // Parameterized constructor
    Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Calculate salary
    public double calculateSalary() {
        return basicSalary;
    }

    // toString()
    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: "
                + calculateSalary();
    }
}


class Manager extends Employee {
    private double bonus;

    // Parameterized constructor
    Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    // Override calculateSalary()
    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: "
                + calculateSalary();
    }
}


public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First employee
        String[] employeeData = sc.nextLine().split(",");

        String type1 = employeeData[0];
        String name1 = employeeData[1];
        String id1 = employeeData[2];
        double salary1 = Double.parseDouble(employeeData[3]);

        Employee employee;

        if (type1.equals("Employee")) {
            employee = new Employee(name1, id1, salary1);
        } else {
            double bonus = Double.parseDouble(employeeData[4]);
            employee = new Manager(name1, id1, salary1, bonus);
        }

        // Second employee
        String[] managerData = sc.nextLine().split(",");

        String type2 = managerData[0];
        String name2 = managerData[1];
        String id2 = managerData[2];
        double salary2 = Double.parseDouble(managerData[3]);

        Employee manager;

        if (type2.equals("Manager")) {
            double bonus2 = Double.parseDouble(managerData[4]);
            manager = new Manager(name2, id2, salary2, bonus2);
        } else {
            manager = new Employee(name2, id2, salary2);
        }

        // Output
        System.out.println(employee);
        System.out.println(manager);

        sc.close();
    }
}