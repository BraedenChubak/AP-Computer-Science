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
            String path = "LibraryManagementLab/book_catalog.csv";  // Change directory as needed
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
            System.out.println("Welcome to the Library!" +
                    "\n1 - Add Book" +
                    "\n2 - Remove Book" +
                    "\n3 - Add Patron" +
                    "\n4 - Remove Patron" +
                    "\n5 - Check Out Book" +
                    "\n6 - Check In Book");
            inNum = input.nextInt();
            System.out.println();
            if (inNum == 1) {
                System.out.println("Enter the book's information!");
                System.out.print("ISBN - ");
                String isbn = input.nextLine();
            }
        }
    }
}
