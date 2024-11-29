//9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
import java.util.Scanner;

public class Assignment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? year + " is a leap year." : year + " is not a leap year.");
    }
}
