import java.util.*;

class Guest {
    private String name;
    private int age;
    private String idProof;

    Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getRoomType() {
        return roomType;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Reservation ID: ")
                .append(reservationId)
                .append(" Room: ")
                .append(roomType)
                .append("\n");

        result.append("Guests:");

        for (Guest guest : guests) {
            result.append("\n").append(guest);
        }

        return result.toString();
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reservation input
        String[] reservationData = sc.nextLine().split(",");

        String reservationId = reservationData[0];
        String roomType = reservationData[1];
        int numberOfGuests = Integer.parseInt(reservationData[2]);

        Reservation reservation =
                new Reservation(reservationId, roomType);

        // Guest inputs
        for (int i = 0; i < numberOfGuests; i++) {
            String[] guestData = sc.nextLine().split(",");

            String name = guestData[0];
            int age = Integer.parseInt(guestData[1]);
            String idProof = guestData[2];

            Guest guest = new Guest(name, age, idProof);
            reservation.addGuest(guest);
        }

        // Output
        System.out.println(reservation);

        sc.close();
    }
}