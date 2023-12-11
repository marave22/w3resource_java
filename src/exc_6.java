import java.util.Scanner;
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5
public class exc_6 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = myNum.nextInt();
        System.out.print("Input second number: ");
        int num2 = myNum.nextInt();
        System.out.println("Expected Output: ");
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Multiply: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Subtract: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Divide: "  + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Remainder of two numbers: " +  num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
