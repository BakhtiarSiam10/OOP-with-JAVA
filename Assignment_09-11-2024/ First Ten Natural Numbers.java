//10.	Write a Java program to display the first 10 natural numbers.
public class Assignment_10 {
  public static void main(String[] args) {
    
    System.out.println("The first 10 natural numbers are:");
        for (int i = 1; i <= 10; i++) {
        System.out.print(i + (i < 10 ? " " : ""));
        
        }
    }
}