// Write a Java program to create a class called " Book" with instance variables title, author, and price.
//  Implement a default constructor and two parameterized constructors:
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookClassWithConstructors {
    public static void main(String[] args) {
        // Creating book objects using different constructors
        Book book1 = new Book();
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99);

        // Displaying book information
        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println("\nBook 2:");
        book2.displayInfo();

        System.out.println("\nBook 3:");
        book3.displayInfo();
    }
}