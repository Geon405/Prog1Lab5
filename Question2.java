/*
 * Write a program to compute the greatest common divisor (gcd) of two integers.
 * In mathematics, the gcd of two or more integers is the largest positive integer that divides each of the integers.
 * For example, the gcd of 8 and 12 is 4;
 * the gcd of 24 and 16 is 8.
 * Your program should provide a type-safe input.
 * It should not crash if either number is not integer, or even if it is not a number.
 */
package javaapplication32;
import java.util.Scanner;

/**
 * Demonstration program to use with javadoc.
 * @author geonkim
 */
public class Question2 {
    
    /**
     * Display a static line of output.
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);  
        // Prompts the user to enter the number1.
        System.out.print("Enter the number1: ");
        int num1 = console.nextInt();          
        
        // Prompts the user to enter the number2.
        System.out.print("Enter the number2: ");    
        int num2 = console.nextInt();
        
        // Using while loop to gives condition before prints the result.
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        // prints the GCD of given number.
        System.out.printf("GCD of given numbers is %d\n", num2);
    }
}
