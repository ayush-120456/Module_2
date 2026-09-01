import java.util.*;

class Vehicle {
    String regNo;
    String brand;
    double baseRate;

    Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {

    Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.5;
    }
}

class Bike extends Vehicle {

    Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.2;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[2];
        String[] types = new String[2];

        // Pehle dono inputs
        for (int i = 0; i < 2; i++) {
            String[] data = sc.nextLine().split(",");

            types[i] = data[0];

            String regNo = data[1];
            String brand = data[2];
            double baseRate = Double.parseDouble(data[3]);

            if (types[i].equals("Car")) {
                vehicles[i] = new Car(regNo, brand, baseRate);
            } else {
                vehicles[i] = new Bike(regNo, brand, baseRate);
            }
        }

        // Ab dono outputs
        for (int i = 0; i < 2; i++) {
            System.out.println(
                    types[i] + " " +
                            vehicles[i].regNo + " " +
                            vehicles[i].brand +
                            " Rent: " +
                            vehicles[i].calculateRent()
            );
        }

        sc.close();
    }
}