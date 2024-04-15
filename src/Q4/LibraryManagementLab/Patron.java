package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    public Patron(String n, String id) {
        name = n;
        patronId = id;
        checkedOutBooks = new ArrayList<>();
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false
    public void checkInBook(Book book) {
        checkedOutBooks.remove(book);
        book.setCheckedOut(false);
    }

    public void checkOutBook(Book book) {
        checkedOutBooks.add(book);
        book.setCheckedOut(true);
    }
}
