import java.util.Scanner;
//Write a Java program to compute the specified expressions and print the output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output
//2.138888888888889
public class exc_9 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Input the numbers for expression: ");
        double num1 = myNum.nextDouble();
        double num2 = myNum.nextDouble();
        double num3 = myNum.nextDouble();
        double num4 = myNum.nextDouble();
        System.out.println("Expected Result: " + ((num1 * num2) - (num2 * num2))/(num3 - num4));
    }
}
