import java.util.Scanner;

class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    String title;
    double price;
    Author author;

    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                "\nPrice: " + (int) price +
                "\nAuthor: " + author;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input:
        // Effective Java,550,Joshua Bloch,jbloch@abc.com,M
        String title = sc.next();
        double price = sc.nextDouble();
        String authorName = sc.next();
        String email = sc.next();
        char gender = sc.next().charAt(0);

        Author author = new Author(authorName, email, gender);
        Book book = new Book(title, price, author);

        System.out.println(book);

        sc.close();
    }
}