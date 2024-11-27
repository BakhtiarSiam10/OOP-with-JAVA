//3.	Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
    
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }
        
        sc.close();
    }
}

