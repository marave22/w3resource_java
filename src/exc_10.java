import java.util.Scanner;
//Write a Java program to compute a specified formula.
//Specified Formula :
//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//Expected Output
//2.9760461760461765
public class exc_10 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.print("Input the main number: ");
        float num = myNum.nextFloat();
        System.out.print("Expected Output for expression: " + num * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0)/11));
    }
}