import java.util.Scanner;

//Write a Java program to divide two numbers and print them on the screen.
public class exc_3 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Enter the numbers:");
        num1 = myNum.nextDouble();
        num2 = myNum.nextDouble();

        double div = num1/num2;
        System.out.println("The division of two numbers: " + div);
    }
}
