package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Library implements LibrarySystem {
    private ArrayList<Book> titleBooks;
    private ArrayList<Book> authorBooks;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    public Library() {
        titleBooks = new ArrayList<>();
        authorBooks = new ArrayList<>();
        patrons = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Implement interface methods
    @Override
    public void addBook(Book book) {
        if (titleBooks.size() == 0) {
            titleBooks.add(book);
            authorBooks.add(book);
        } else {
            for (int lcv = 0; lcv < titleBooks.size(); lcv++) {
                if (book.getTitle().compareTo(titleBooks.get(lcv).getTitle()) >= 0 ) {
                    titleBooks.add(lcv, book);
                    break;
                }
            }
            for (int lcv = 0; lcv < authorBooks.size(); lcv++) {
                if (book.getAuthor().compareTo(authorBooks.get(lcv).getAuthor()) >= 0 ) {
                    authorBooks.add(lcv, book);
                    break;
                }
            }
        }
    }
    @Override
    public void removeBook(String isbn) {
        for (Book book : titleBooks) {
            if (isbn.equals(book.getIsbn())) {
                titleBooks.remove(book);
                authorBooks.remove(book);
            }
        }
    }

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
        for (int lcv = transactions.size()-1; lcv >= 0; lcv--) {
            if (isbn.equals(transactions.get(lcv).getIsbn())) {
                System.out.println(transactions.get(lcv));
            }
        }
    }

    @Override
    public boolean checkoutBook(String isbn, String patronId) {
        for (int lcv = 0; lcv <= titleBooks.size(); lcv++) {
            if (isbn.equals(titleBooks.get(lcv).getIsbn())) {
                if (titleBooks.get(lcv).isAvailable()) {
                    createTransaction(isbn, patronId, getDateToday());
                    titleBooks.get(lcv).setCheckedOut(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkinBook(String isbn, String patronId) {
        for (int lcv = 0; lcv <= titleBooks.size(); lcv++) {
            if (isbn.equals(titleBooks.get(lcv).getIsbn())) {
                if (titleBooks.get(lcv).isAvailable()) {
                    updateTransaction(isbn, patronId, getDateToday());
                    titleBooks.get(lcv).setCheckedOut(false);
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public Book findClosestBook(String title) {
        for (Book book : titleBooks) {
            if (title.toLowerCase().contains(book.getTitle().toLowerCase()) || book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
            return null;
        }
    }

    @Override
    public Book searchBookByTitle(String title) {
        Book theBook = BinarySearchUtil.searchTitle(titleBooks, title);
        if (theBook != null) {
            return theBook;
        }
        return findClosestBook(title);
    }

    @Override
    public Book searchBookByAuthor(String author) {
        Book theBook = BinarySearchUtil.searchAuthor(authorBooks, author);
        if (theBook != null) {
            return theBook;
        }
        return null;
    }

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
