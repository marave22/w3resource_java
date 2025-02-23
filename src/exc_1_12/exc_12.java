package exc_1_12;

import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class exc_12 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter the count of numbers: ");
        int count = number.nextInt();
        int i = 0;
        double sum = 0;
        do {
            System.out.print("Please enter the number: ");
            double num = number.nextDouble();
            i++;
            sum += num;
        } while (i < count);
        number.close();
        System.out.print("The average of the numbers: " + sum/count);
    }
}