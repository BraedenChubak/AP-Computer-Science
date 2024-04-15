package Q4.LibraryManagementLab;

import java.util.*;

public class BinarySearchUtil {
    // TODO: Implement binary search method (takes in ArrayList) using recursion for searching books by title (required) or author
    public Book searchTitle(ArrayList<Book> books, String title) {
        // first we sort
        for (int lcv = 0; lcv < books.size()-1; lcv++) {
            if (books.get(lcv).getTitle().compareTo(books.get(lcv+1).getTitle()) > 0) {
                Book temp = books.get(lcv);
                books.set(lcv, books.get(lcv+1));
                books.set(lcv+1, temp);
            }
        }

        // then we search
        int low = 0;
        int high = books.size()-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (books.get(mid).getTitle().equals(title)) { return books.get(mid); }
            if (books.get(mid).getTitle().compareTo(title) < 0) { low = mid + 1; }
            else { high = mid - 1; }
        }
        return null;
    }
}
