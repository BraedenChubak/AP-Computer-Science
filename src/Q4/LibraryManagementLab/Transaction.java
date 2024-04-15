package Q4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default
    public Transaction(String i, String id, String date) {
        isbn = i;
        patronId = id;
        checkoutDate = date;
        returnDate = null;
    }

    // TODO: Implement getters and setters
    public void setReturnDate(String date) {
        returnDate = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
