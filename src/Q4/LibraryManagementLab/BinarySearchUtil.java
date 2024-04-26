package Q4.LibraryManagementLab;

import java.util.*;

public class BinarySearchUtil {
    public static Book searchTitle(ArrayList<Book> books, String title) {
        int low = 0;
        int high = books.size()-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (books.get(mid).getTitle().equals(title)) { return books.get(mid); }
            if (books.get(mid).getTitle().compareTo(title) > 0) { low = mid + 1; }
            else { high = mid - 1; }
        }
        return null;
    }
    public static Book searchAuthor(ArrayList<Book> books, String author) {
        int low = 0;
        int high = books.size()-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (books.get(mid).getAuthor().equals(author)) { return books.get(mid); }
            if (books.get(mid).getAuthor().compareTo(author) > 0) { low = mid + 1; }
            else { high = mid - 1; }
        }
        return null;
    }
}
