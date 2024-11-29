//7. Write a Java program to find the number of days in a month.
import java.util.Scanner;

public class Assignment_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
        int days = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? 31 : 
                   (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 
                   (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) ? 29 : 
                   (month == 2) ? 28 : 0;
        
        System.out.println(days == 0 ? "Invalid month." : "Days: " + days);
        
        sc.close();
    }
}
