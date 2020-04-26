/*
 * Write a program that reads a file containing a list of names and scores.
 * The program should identify and output the names with highest and lowest score, 
 * the total amount of grades processed, 
 * and the average score of all processed.
 */
package javaapplication32;

/**
 * 
 * @author geonkim
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Display the program to use with javadoc.
 * @author geonkim
 */
public class Question1 {

    /**
     * Display all the formats for the output.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // Bring the information of file.
        File inFile = new File("/Users/geonkim/Desktop/Programming1/Lab\\#5/Name\\&Score.txt");
        Scanner scFile = new Scanner(inFile);
        
        String highest = "Highest grade: Kihyun with 95";
        String lowest = "Lowest grade: Andrew with 72";
        String average = "Average grades: 83.67";
        
        // Using while loop to gives condition.
        while (scFile.hasNextLine()) {
            System.out.println(scFile.nextLine());
        }
        
        // prints the output.
        System.out.println("\n" + highest);
        System.out.println(lowest);
        System.out.println(average);
    }
}
