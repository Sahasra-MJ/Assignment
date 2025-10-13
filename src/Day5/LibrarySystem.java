package Day5;

import java.util.*;

class Library {
    class Book {
        String title;
        String author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void displayBookDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);

        System.out.println("\n--- Book Details ---");
        b.displayBookDetails();
        System.out.println();
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    lib.addBook();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}
