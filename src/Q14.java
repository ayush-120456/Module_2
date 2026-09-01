import java.util.*;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    Account(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account("A101", "Ravi", 0);

        int n = Integer.parseInt(sc.nextLine());

        String[] operations = new String[n];

        // Pehle saare inputs
        for (int i = 0; i < n; i++) {
            operations[i] = sc.nextLine();
        }

        // Ab saare operations perform + output
        for (String operation : operations) {
            String[] data = operation.split(" ");

            if (data[0].equals("deposit")) {
                double amount = Double.parseDouble(data[1]);
                account.deposit(amount);

                System.out.println("Deposited: " + amount);

            } else if (data[0].equals("withdraw")) {
                double amount = Double.parseDouble(data[1]);
                account.withdraw(amount);

                System.out.println("Withdrawn: " + amount);

            } else if (data[0].equals("getBalance")) {
                System.out.println("Balance: " + account.getBalance());
            }
        }

        sc.close();
    }
}