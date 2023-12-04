//Write a Java program to print the sum of two numbers.
//        Test Data:
//        74 + 36
//        Expected Output :
//        110

import java.util.Scanner;

public class exc_2 {

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter the first number:");
        num1 = myNum.nextInt();
        num2 = myNum.nextInt();

        int sum = num1 + num2;

        System.out.println("Summary of two numbers: " + sum);
    }
}
