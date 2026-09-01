import java.util.*;

class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name +
                " DOB: " + dob +
                " Address: " + address + "\n" +
                "Passport: " + passport.getPassportNo() +
                " Issue: " + passport.getIssueDate() +
                " Expiry: " + passport.getExpiryDate();
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Citizen input
        String[] citizenData = sc.nextLine().split(",");

        String name = citizenData[0];
        String dob = citizenData[1];
        String address = citizenData[2];

        // Passport input
        String[] passportData = sc.nextLine().split(",");

        Passport passport = new Passport(
                passportData[0],
                passportData[1],
                passportData[2]
        );

        // Create Citizen
        Citizen citizen = new Citizen(
                name, dob, address, passport
        );

        // Output
        System.out.println(citizen);

        sc.close();
    }
}