import java.util.*;

class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class Student {
    String name;
    Course enrolledCourse;

    Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    void display() {
        System.out.println("Student: " + name +
                " Course: " + enrolledCourse.courseName +
                " (" + enrolledCourse.duration + ")");
    }
}

class PremiumStudent extends Student {
    int discount;

    PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    void display() {
        System.out.println("Premium Student: " + name +
                " Course: " + enrolledCourse.courseName +
                " (" + enrolledCourse.duration +
                ") Discount: " + discount + "%");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Course input
        String[] courseData = sc.nextLine().split(",");
        Course course = new Course(courseData[0], courseData[1]);

        Student[] students = new Student[2];

        // Normal Student
        String[] studentData = sc.nextLine().split(",");
        students[0] = new Student(
                studentData[0],
                course
        );

        // Premium Student
        String[] premiumData = sc.nextLine().split(",");
        students[1] = new PremiumStudent(
                premiumData[0],
                course,
                Integer.parseInt(premiumData[2])
        );

        // Output after taking all inputs
        for (Student student : students) {
            student.display();
        }

        sc.close();
    }
}