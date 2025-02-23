//2. Parameterized Constructor:
//Write a Java program to create a class called Dog with instance variables name and color.
// Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
// Print the values of the variables.

package OOP.JavaConstructor;

public class Dog {
    private final String name;
    private final String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Harley", "Black");
        System.out.println("Dog's name is: " + dog.name);
        System.out.println("Dog's color is: " + dog.color);
    }
}
