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

/**
 * Variables of this program.
 * @author geonkim
 */
public class Book {
    
    private String title;
    private String author;
    private int isbn;
    private int yearOfPublishing;
    private static String publisher = "Vanier";
    private static int amountofBooks = 0;
    
    /**
     * code to determine what the book consists of.
     */
    public Book () {
        this.title = "Empty";
        this.author = "Empty";
        this.isbn = 0;
        this.yearOfPublishing = 0;
    }
    
    /**
     *
     * @param title
     * @param author
     * @param isbn
     * @param yearOfPublishing
     */
    public Book(String title, String author, int isbn, int yearOfPublishing) {
        this.amountofBooks++;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearOfPublishing = yearOfPublishing;
    }
    
    /**
     * get the value of title.
     * @param title
     */
    
    public void getTitle (String title) {
        this.title = title;
    }

    /**
     * set the value of title.
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * get the value of author.
     * @param author
     */
    public void getAuthor (String author) {
        this.author = author;
    }
    
    /**
     * set the value of author.
     * @param author
     */
    public void setAuthor (String author) {
        this.author = author;
    }
    
    /**
     * get the value of Isbn.
     * @return Isbn.
     */
    
    public int getIsbn() {
        return isbn;
    }
    
    /**
     * set the value of Isbn.
     * @return Isbn.
     */
    public int setIsbn() {
        return isbn;
    }   
    
    /**
     * get the value of Year of publishing.
     * @return yearOfPublishing.
     */
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    
    /**
     * set the value of Year of publishing.
     * @return yearOfPublishing.
     */
    public int setYearOfPublishing() {
        return yearOfPublishing;
    }
    
    /**
     * get the value of publisher.
     * @return publisher.
     */
    public String getPublishing() {
        return publisher;
    }
    
    /**
     * set the value of publisher.
     * @return publisher.
     */
    public String setPublishing() {
        return publisher;
    }
    
    /**
     * get the value of amount of books.
     * @return amount of books.
     */
    public int getAmountOfBooks() {
        return amountofBooks;
    }
    
    /**
     * set the value of amount of books.
     * @return amount of books.
     */
    public int setAmountOfBooks() {
        return amountofBooks;
    }

    /**
     * To gives a equal condition.
     * @param other
     * @return
     */
    public boolean equals (Book otherBook) {
        if (this.isbn != otherBook.isbn) return false;
        return true;
    }

    @Override
    // To shows how you will going to print in output.
    public String toString() {
        return "Title: " + title
                + "\nAuthor: " + author
                + "\nYear Published: " + yearOfPublishing
                + "\nISBN: " + isbn
                + "\nThe publisher is " + publisher
                + "and the number of books is " + amountofBooks;
    }
}