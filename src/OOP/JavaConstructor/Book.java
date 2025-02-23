//3. Constructor Overloading
//Write a Java program to create a class called "Book" with instance variables title, author, and price.
// Implement a default constructor and two parameterized constructors:
//One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each constructor.

package OOP.JavaConstructor;

public class Book {
    private final String title;
    private final String author;
    private final double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("Default Constructor Title is: " + defaultBook.title);
        System.out.println("Default Constructor Author is: " + defaultBook.author);
        System.out.println("Default Constructor Price is: " + defaultBook.price);

        Book firstParametrized = new Book("First Parametrized", "John");
        System.out.println("First Constructor Title is: " + firstParametrized.title);
        System.out.println("First Constructor Author is: " + firstParametrized.author);
        System.out.println("First Constructor Price is: " + firstParametrized.price);

        Book secondParametrized = new Book("Second Parametrized", "John", 5.5);
        System.out.println("Second Constructor Title is: " + secondParametrized.title);
        System.out.println("Second Constructor Author is: " + secondParametrized.author);
        System.out.println("Second Constructor Price is: " + secondParametrized.price);
    }
}
