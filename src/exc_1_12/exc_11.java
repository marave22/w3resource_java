package exc_1_12;

import java.util.Scanner;

//Write a Java program to print the area and perimeter of a circle.
public class exc_11 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.print("Please enter the radius of circle: ");
        double rad = radius.nextDouble();
        double pi = Math.PI;
        System.out.println("The area of the circle is: " + (pi * Math.pow(rad, 2)));
        System.out.println("The perimeter of the circle is: " + (2 * pi * rad));
    }
}
