package Q4.LibraryManagementLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "C:\\Users\\chubak.b\\IdeaProjects\\AP-Computer-Science\\src\\Q4\\LibraryManagementLab\\book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog.");
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Library library = new Library();
        for (Book book : loadCatalog()) {
            library.addBook(book);
        }
        Scanner input = new Scanner(System.in);
        int inNum = 1;
        while (inNum != 0) {
            System.out.print("""
                    
                    Welcome to the Library!
                    1 - Add Book
                    2 - Remove Book
                    3 - Add Patron
                    4 - Remove Patron
                    5 - Check Out Book
                    6 - Check In Book
                    7 - Search Book
                    8 - Search Book Transaction
                    0 - Exit
                    Enter Choice:\040""");
            inNum = input.nextInt();
            System.out.println();
            if (inNum == 1) {
                System.out.println("Enter the book's information!");
                System.out.print("ISBN - ");
                String temp = input.next();
                String isbn = temp + input.nextLine();
                System.out.print("Title - ");
                String temp2 = input.next();
                String title = temp2 + input.nextLine();
                System.out.print("Author - ");
                String temp3 = input.next();
                String author = temp3 + input.nextLine();
                library.addBook(new Book(title, isbn, author));
            }
            else if (inNum == 2) {
                System.out.print("Enter the ISBN of the Book - ");
                String temp = input.next();
                String isbn = temp + input.nextLine();
                library.removeBook(isbn);
            }
            else if (inNum == 3) {
                System.out.println("Enter the Patron's info!");
                System.out.print("Name - ");
                String temp = input.next();
                String name = temp + input.nextLine();
                System.out.print("ID - ");
                String temp2 = input.next();
                String id = temp2 + input.nextLine();
                library.addPatron(new Patron(name, id));
            }
            else if (inNum == 4) {
                System.out.print("Enter the Patron's ID - ");
                String temp = input.next();
                String id = temp + input.nextLine();
                library.removePatron(id);
            }
            else if (inNum == 5) {
                System.out.print("Enter the ISBN of the Book - ");
                String temp = input.next();
                String isbn = temp + input.nextLine();
                System.out.print("Enter the ID of the Patron - ");
                String id = input.nextLine();
                if (library.checkoutBook(isbn, id)) {
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Error! Book cannot be checked out!");
                }
            }
            else if (inNum == 6) {
                System.out.print("Enter the ISBN of the Book - ");
                String temp = input.next();
                String isbn = temp + input.nextLine();
                System.out.print("Enter the ID of the Patron - ");
                String id = input.nextLine();
                if (library.checkinBook(isbn, id)) {
                    System.out.println("Book checked in successfully!");
                } else {
                    System.out.println("Error! Book cannot be checked in!");
                }
            }
            else if (inNum == 7) {
                System.out.print("Would you like to search by title (T) or author (A): ");
                String choice = input.next();
                if (choice.equals("T")) {
                    System.out.print("Enter the Title of the Book - ");
                    String temp = input.next();
                    String title = temp + input.nextLine();
                    System.out.println(title);
                    if (library.searchBookByTitle(title) != null) {
                        System.out.println(library.searchBookByTitle(title));
                    } else {
                        System.out.println("Could not find that book! Try again!");
                    }
                } else if (choice.equals("A")) {
                    System.out.print("Enter the Author of the Book - ");
                    String temp = input.next();
                    String author = temp + input.nextLine();
                    if (library.searchBookByAuthor(author) != null) {
                        System.out.println(library.searchBookByAuthor(author));
                    } else {
                        System.out.println("Could not find that book! Try again!");
                    }
                } else {
                    System.out.println("Error! Input not accepted, try again!");
                }
            }
            else if (inNum == 8) {
                System.out.print("Enter the ISBN of the book you would like to see! ");
                input.next();
                String isbn = input.nextLine();
                library.viewMostRecentTransaction(isbn);
            }
        }
    }
}
/*

 */