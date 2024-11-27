//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.Scanner;

public class Assignment_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first floating-point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = sc.nextDouble();
        
        if (Math.abs(num1 - num2) < 0.001) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
        sc.close();
    }
}
