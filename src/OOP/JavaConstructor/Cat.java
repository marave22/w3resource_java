//1. Default Constructor:
//Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default
// constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

package OOP.JavaConstructor;

public class Cat {
    private final String name;
    private final double age;
    private final String breed;
    private final double weight;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
        this.breed = "Unknown";
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public double setAge(double age) {
        if (age < 1) {
            System.out.println("Cat is a kitten");
        }
        return age;
    }

    public String setBreed(String breed) {
        return breed;
    }

    public String setWeight(double weight) {
        if (weight < 1) {
            System.out.println("Cat is a kitten");
        }
        return "Weight is: " + weight;
    }

    public String compareCatsAge(int ageCat1, int ageCat2) {
        if (ageCat1 > ageCat2) {
            return "First Cat is bigger than second";
        } else {
            return "First Cat is smaller than second";
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat's Name: " + cat.getName());
        System.out.println(cat.setAge(0.5));
        System.out.println("Cat's breed: "  + cat.setBreed("Siamese cat"));
        System.out.println(cat.setWeight(0.9));
        System.out.println(cat.compareCatsAge((int) cat.setAge(3), (int) cat.setAge(2)));
    }
}
