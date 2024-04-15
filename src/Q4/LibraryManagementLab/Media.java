package Q4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    public Media (String t, String i) {
        title = t;
        isbn = i;
        isCheckedOut = false;
    }

    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return !isCheckedOut; }
}
