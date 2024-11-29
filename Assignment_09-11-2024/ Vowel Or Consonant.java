//8.	Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter(between a and z or A and Z), or is a string of length > 1, print an error message.
import java.util.Scanner;

public class Assignment_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        String input = sc.nextLine();
        
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = input.charAt(0);
            System.out.println("AEIOUaeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant");
        } else {
            System.out.println("Error: Please enter a valid single letter.");
        }
        
        sc.close();
    }
}
