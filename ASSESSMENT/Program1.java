package com.Assessment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Program1{
    private static final String PASSWORD = "123";
    private static String currentPassword = "";

    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter password: ");
        currentPassword = scanner.nextLine();

        if (currentPassword.equals(PASSWORD)) {
            showMainMenu();
        } else {
            System.out.println("Incorrect password. Exiting...");
        }
    }

    private static void showMainMenu() {
        int choice;
        do {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add Books");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. View Book List");
            System.out.println("5. Edit Book Record");
            System.out.println("6. Change Password");
            System.out.println("7. Close Application");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBooks();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    viewBookList();
                    break;
                case 5:
                   
                    System.out.println("Option 5 - Edit Book Record");
                    break;
                case 6:
                    changePassword();
                    break;
                case 7:
                    System.out.println("Exiting in 3 seconds...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    private static void addBooks() {
        System.out.println("\nSELECT CATEGORIES");
        System.out.println("1. Computer");
        System.out.println("2. Electronics");
        System.out.println("3. Electrical");
        System.out.println("4. Civil");
        System.out.println("5. Mechanical");
        System.out.println("6. Architecture");
        System.out.println("7. Back to main menu");
        System.out.print("Enter your choice: ");

        int categoryChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (categoryChoice >= 1 && categoryChoice <= 6) {
            System.out.println("\nEnter the Information Below");
            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Book Name: ");
            String bookName = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            // Create book and add to the list
            Book book = new Book(category, bookId, bookName, author, quantity, price);
            books.add(book);

            System.out.println("Book added successfully!");
        } else if (categoryChoice == 7) {
            // Back to main menu
            return;
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void deleteBook() {
        System.out.print("\nEnter the book id to delete: ");
        int bookIdToDelete = scanner.nextInt();

        boolean found = false;
        for (Book book : books) {
            if (book.getBookId() == bookIdToDelete) {
                books.remove(book);
                found = true;
                System.out.println("Book deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    private static void searchBook() {
        System.out.println("\n1. Search by ID");
        System.out.println("2. Search by Name");
        System.out.print("Enter your choice: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        HashSet<Book> searchResults = new HashSet<>();

        switch (searchChoice) {
            case 1:
                System.out.print("Enter the book ID to search: ");
                int searchById = scanner.nextInt();

                for (Book book : books) {
                    if (book.getBookId() == searchById) {
                        searchResults.add(book);
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("Enter the book name to search: ");
                String searchByName = scanner.nextLine();

                for (Book book : books) {
                    if (book.getBookName().equalsIgnoreCase(searchByName)) {
                        searchResults.add(book);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }

        if (searchResults.isEmpty()) {
            System.out.println("No books found!");
        } else {
            System.out.println("Search Results:");
            for (Book book : searchResults) {
                book.displayBookDetails();
            }

            System.out.print("Try another search? (Y/N): ");
            String tryAnotherSearch = scanner.nextLine();
            if (!tryAnotherSearch.equalsIgnoreCase("Y")) {
                return;
            }
        }
    }

    private static void viewBookList() {
        if (books.isEmpty()) {
            System.out.println("No books found!");
        } else {
            System.out.println("Book List:");
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }

    private static void changePassword() {
        System.out.print("\nEnter old password: ");
        String oldPassword = scanner.nextLine();

        if (oldPassword.equals(currentPassword)) {
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();

            currentPassword = newPassword;
            System.out.println("Password successfully changed!");
        } else {
            System.out.println("Incorrect old password!");
        }
    }
}

class Book {
    private String category;
    private int bookId;
    private String bookName;
    private String author;
    private int quantity;
    private double price;

    public Book(String category, int bookId, String bookName, String author, int quantity, double price) {
        this.category = category;
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void displayBookDetails() {
        System.out.println("\nCATEGORY: " + category);
        System.out.println("ID: " + bookId);
        System.out.println("BOOK NAME: " + bookName);
        System.out.println("AUTHOR: " + author);
        System.out.println("QUANTITY: " + quantity);
        System.out.println("PRICE: " + price);
        
    }
}
