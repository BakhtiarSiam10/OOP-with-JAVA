//12.	Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 5;

        for (int i = 1; i <= count; i++) {
        System.out.print("Enter number " + i + ": ");
        sum += scanner.nextInt();
        }

       double average = sum / (double) count;

       System.out.println("Sum: " + sum);
       System.out.println("Average: " + average);

       scanner.close();
    }
}
