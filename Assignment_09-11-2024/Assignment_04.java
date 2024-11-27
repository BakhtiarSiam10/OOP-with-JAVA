//4.	Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
import java.util.Scanner;

public class Assignment_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a floating-point number: ");
        float number = scanner.nextFloat();
        
        if (number == 0) {
            System.out.println("zero");
        } else {
            String result = (number > 0) ? "positive" : "negative";
          if (Math.abs(number) < 1) {
                result += " small";
        } else if (Math.abs(number) > 1_000_000) {
                result += " large";
            }
            System.out.println(result);
        }
        
      scanner.close();
    }
}
