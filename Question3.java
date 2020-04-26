/*
 * Write a class encapsulating the concept of a book.
 * The attributes of a book are title, author, ISBN and year of publishing.
 * The class has a static attribute publisher initialized as “Vanier”, 
 * and an amountOfBooks, which is initially zero.
 * Include a constructor, accessors and mutators, and the methods toString and equals.
 * Every time a new object is instantiated, the class variable amountOfBooks is incremented by 1.
 * When a book object is printed, it should output all its attributes in a nice way.
 * Two books are considered equal if they have the same ISBN. 
 * Make sure you have at least one method that uses the object reference this.
 * Write a client class to test all the methods in your Book class. 
 * Also test if two book objects share the same values for publisher and amountOfBooks.
 */
package javaapplication32;

import java.util.Scanner;

/**
 * Demonstration program to use with javadoc.
 * @author geonkim
 */
public class Question3 {
    
    /**
     * Display a static line of output.
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        //prints the book1
        Book book1 = new Book();
        System.out.println(book1);
        
        // prints the book2
        Book book2 = new Book("On the Road", "Kerouac", 978014042,2014);
        System.out.println(book2);
        
        // prints the book3
        Book book3 = new Book("Harry Potter and the Cursed Child", "J.K. Rowling", 125964236, 2016);
        System.out.println(book3);
    }
}
