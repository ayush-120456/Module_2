import java.util.*;

abstract class Loan {
    double principal;
    double rate;
    double time;

    Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {

    HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {

    CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loan[] loans = new Loan[2];
        String[] types = new String[2];

        // Pehle dono inputs
        for (int i = 0; i < 2; i++) {
            String[] data = sc.nextLine().split(",");

            types[i] = data[0];

            double principal = Double.parseDouble(data[1]);
            double time = Double.parseDouble(data[2]);

            if (types[i].equals("Home")) {
                loans[i] = new HomeLoan(principal, time);
            } else {
                loans[i] = new CarLoan(principal, time);
            }
        }

        // Ab dono outputs ek saath
        for (int i = 0; i < 2; i++) {
            System.out.println(
                    types[i] + " Loan Interest: " +
                            loans[i].calculateInterest()
            );
        }

        sc.close();
    }
}