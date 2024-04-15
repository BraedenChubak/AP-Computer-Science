package Q4.LibraryManagementLab;

public class Book extends Media {
    private String author;

    public Book(String t, String i, String a) {
        super(t, i);
        author = a;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
