import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number > 0 ? "Positive" : (number < 0 ? "Negative" : "Zero"));
        scanner.close();
    }
}
