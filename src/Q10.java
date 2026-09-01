import java.util.*;

interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {

    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Device[] devices = new Device[2];

        // Pehle dono inputs
        for (int i = 0; i < 2; i++) {
            String type = sc.nextLine();

            if (type.equals("Fan")) {
                devices[i] = new Fan();
            } else if (type.equals("Light")) {
                devices[i] = new Light();
            }
        }

        // Ab dono devices ka output
        for (Device device : devices) {
            device.turnOn();
            device.turnOff();
        }

        sc.close();
    }
}