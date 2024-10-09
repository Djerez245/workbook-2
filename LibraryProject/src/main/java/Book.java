import java.util.Scanner;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;
    private String reset = "\u001B[0m";
    private String red = "\u001B[0;31m";
    private String green = "\u001B[0;32m";
    private String blue = "\u001B[0;34m";


    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(green).append(" The book title is: ").append(reset).append( title);
//        sb.append(blue).append(" ---- ").append(reset);
//        sb.append(green).append(" The book isbn number is: ").append(reset).append( isbn);
//        sb.append(blue).append(" ---- ").append(reset);
//        sb.append(green).append("Book ID is: ").append(reset).append( id);
//        sb.append(blue).append(" ---- ").append(reset);
//        sb.append(green).append(" The book is checked out:").append(reset).append( isCheckedOut);
//        sb.append("\n");
//        sb.append(green).append(" The book is checked out to: ").append(reset).append( checkedOutTo);
//        sb.append("\n");
        return String.format(
                green + " The book title is: " + reset + blue + "%s" + reset + red + " ---- " + reset +
                        green + " The book isbn number is: " + reset + blue + "%s" + red + " ---- " + reset +
                        green + " Book ID is: " + reset + blue + "%s" + red + "----" + reset +
                        green + " The book is checked out: " + reset + blue + "%s" + red + " ---- " + reset +
                        green + " The book is checked out to: " + reset + blue + "%s" + reset,
                title, isbn, id, isCheckedOut, checkedOutTo);

    }


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
        this.reset = reset;
        this.red = red;
        this.green = green;
        this.blue = blue;
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





