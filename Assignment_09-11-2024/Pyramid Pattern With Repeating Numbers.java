//19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
import java.util.Scanner;

public class Assignment_19 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
             for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
