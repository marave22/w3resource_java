//Write a Java program to print the results of the following operations.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3

import java.util.Scanner;
public class exc_4 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        int num1 = myNum.nextInt();
        int num2 = myNum.nextInt();
        int num3 = myNum.nextInt();
        int num4 = myNum.nextInt();
        int num5 = myNum.nextInt();
        int num6 = myNum.nextInt();

        System.out.println("Enter numbers for the expressions:");
        int a =  num1 + (num2 * num3);
        System.out.println("Print the a: " +  a);

        int b =  (num1 + num2) % num3;
        System.out.println("Print the b: " +  b);

        int c = (num1 + (num2 * num3)) / num4;
        System.out.println("Print the c: " +  c);

        int d = (num1 + num2) / ((num3 * num4) - (num5 % num6));
        System.out.println("Print the d: " +  d);
    }
}
