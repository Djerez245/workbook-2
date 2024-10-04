import java.util.Scanner;

public class Book {

    private int id;
    private String isbn;
    private String title;
    boolean isCheckedOut;
    private String checkedOutTo;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book ID is: ").append( id);
        sb.append(" The book isbn number is: ").append( isbn);
        sb.append(" The book title is: ").append( title);
        sb.append(" The book is checked out:").append( isCheckedOut);
        sb.append(" The book is checked out to: ").append( checkedOutTo);
        return sb.toString();
    }


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}





