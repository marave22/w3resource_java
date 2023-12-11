//Write a Java program that takes two numbers as input and displays the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125

import java.util.Scanner;
public class exc_5 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = myNum.nextInt();
        System.out.print("Input second number: ");
        int num2 = myNum.nextInt();
        System.out.print("Expected Output: " + (num1 * num2));
    }
}