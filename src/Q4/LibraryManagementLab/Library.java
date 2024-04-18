package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Implement interface methods
    @Override
    public void addBook(Book book) {
        if (books.size() == 0) {
            books.add(book);
        }
        else {
            for (int lcv = 0; lcv < books.size(); lcv++) {
                if (book.getTitle().compareTo(books.get(lcv).getTitle()) >= 0 ) {
                    books.add(lcv, book);
                    break;
                }
            }

        }
    }
    @Override
    public void removeBook(String isbn) { /* Implementation */ }

    // Other methods...

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void removePatron(String patronId) {
        for (Patron p : patrons) {
            if (p.getPatronId().equals(patronId)) {
                patrons.remove(p);
                break;
            }
        }
    }

    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        transactions.add(new Transaction(isbn, patronId, checkoutDate));
    }

    public void updateTransaction(String isbn, String patronId, String returnDate) {
        for (Transaction t : transactions) {
            if (t.getIsbn().equals(isbn) && t.getPatronId().equals(patronId)) {
                t.setReturnDate(returnDate);
                break;
            }
        }
    }


    @Override

    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
    }

    // TODO: Complete the implementation of LibrarySystem methods

    // boolean checkoutBook(String isbn, String patronId)

    // boolean checkinBook(String isbn, String patronId)

    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
    }

    // public Book searchBookByAuthor(String author)

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}