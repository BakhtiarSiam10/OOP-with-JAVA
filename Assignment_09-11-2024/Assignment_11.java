//11.	Write a Java program to display n terms of natural numbers and their sum.
import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms:  ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        
        System.out.println("\nSum:  " + sum);
        scanner.close();
    }
}
