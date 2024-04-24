package Encapsulation;

import java.util.Scanner;

/*
Book Inventory:
Create a BookInventory class with private instance variables for book title, author, and quantity.
Add public methods to update and retrieve book information.
*/
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book b1 = new Book();
        System.out.println("What is the title:");
        String title = input.next();
        System.out.println("Who is the author:");
        String author = input.next();
        System.out.println("What is the price:");
        double price = input.nextDouble();

        b1.printInfo(title, author, price);

        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());

    }
}

class Book {

    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
