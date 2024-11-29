//16. Write a java program to make such a pattern like a right angle triangle with a number.
import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(j);
            }
            System.out.println();
        }
        
      scanner.close();
    }
}
