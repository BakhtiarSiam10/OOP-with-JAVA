//15. Write a Java program that displays the sum of n odd natural numbers.
import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i - 1;
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
