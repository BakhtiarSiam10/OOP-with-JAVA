//13. Write a java program to display the cube of the given number up to an integer.
import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Cube of " + n + " is: " + (n * n * n));

        scanner.close();
    }
}
