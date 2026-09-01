import java.util.*;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    // Constructor
    Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    // Getters
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Student_1 {
    private String name;
    private int roll;
    private String course;
    private Room room;

    // Constructor
    Student_1(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getCourse() {
        return course;
    }

    public Room getRoom() {
        return room;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " +
                course + "\n" +
                "Room: " + room.getRoomNumber() + " " +
                room.getBlock() + " " +
                room.getType();
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student input
        String[] studentData = sc.nextLine().split(",");

        String name = studentData[0];
        int roll = Integer.parseInt(studentData[1]);
        String course = studentData[2];

        // Room input
        String[] roomData = sc.nextLine().split(",");

        String roomNumber = roomData[0];
        String block = roomData[1];
        String type = roomData[2];

        // Create Room object
        Room room = new Room(roomNumber, block, type);

        // Create Student object
        Student_1 student = new Student_1(name, roll, course, room);

        // Output
        System.out.println(student);

        sc.close();
    }
}