//5. Write a Java program to create a class called Rectangle with instance variables length and width.
// Implement a parameterized constructor and a copy constructor that initializes
// a new object using the values of an existing object. Print the values of the variables.

package OOP.JavaConstructor;

public class Rectangle {
    final int width;
    final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.length = rectangle.length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Rectangle 1 length: " + rectangle.length);
        System.out.println("Rectangle 1 width: " + rectangle.width);

        Rectangle rectangle2 = new Rectangle(rectangle);
        System.out.println("Rectangle 2 length: " + rectangle2.length);
        System.out.println("Rectangle 2 width: " + rectangle2.width);
    }
}
