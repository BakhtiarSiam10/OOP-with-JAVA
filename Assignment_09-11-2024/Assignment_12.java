//12.	Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextInt();
        }
        double average = sum / 5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
