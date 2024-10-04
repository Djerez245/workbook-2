import java.util.Scanner;

public class Book {

    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    public String toString(){
    StringBuilder sb = new StringBuilder();
        sb.append("Book ID is: ").append(id);
        sb.append("The book isbn number is: ").append(isbn);
        sb.append("The book title is: ");
        sb.append("The book is checked out").append(isCheckedOut);
        sb.append("The book is checked out to: ");
        return sb toString();
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

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(1, "978-0451524935", "To Kill a Mockingbird", false, "");
        Book book2 = new Book(2, "978-0451524935", "1984", false, "");
        Book book3 = new Book(3, "978-1503290563", "Pride and Prejudice", false, "");
        Book book4 = new Book(4, "978-0743273565", "The Great Gatsby", true, "Leonardo Dicaprio");
        Book book5 = new Book(5, "978-1503280786", "Moby Dick", false, "");
        Book book6 = new Book(6, "978-1420954150", "War and Peace", false, "");
        Book book7 = new Book(7, "978-0316769488", "The Catcher in the Rye", true, "Damian Jerez");
        Book book8 = new Book(8, "978-0547928227", "The Hobbit", false, "");
        Book book9 = new Book(9, "978-0060850524", "Brave New World", false, "");
        Book book10 = new Book(10, "978-1451673319", "Fahrenheit 451", true, "George Washington");
        Book book11 = new Book(11, "978-1505290824", "The Picture of Dorian Gray", true, "Micheal Jordan");
        Book book12 = new Book(12, "978-0062315007", "The Alchemist", false, "");
        Book book13 = new Book(13, "978-0060838202", "The Bell Jar", false, "");
        Book book14 = new Book(14, "978-0060883288", "The Bible", true, "Jesus Christ");
        Book book15 = new Book(15, "978-0307387899", "The Road", false, "");
        Book book16 = new Book(16, "978-1503280298", "Little Women", false, "");
        Book book17 = new Book(17, "978-1594631931", "The Kite Runner", false, "");
        Book book18 = new Book(18, "978-0143034902", "The Shadow of the Wind", false, "");
        Book book19 = new Book(19, "978-0062316097", "Sapiens: A Brief History of Humankind", false, "");
        Book book20 = new Book(20, "978-0385534635", "The Night Circus", false, "");


        Book[] allBooks = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11,
                book12, book13, book14, book15, book16, book17, book18, book19, book20};


        System.out.println("""
                    ========================================================
                                      WELCOME TO THE LIBRARY
                    ========================================================
                                  Please only enter a number 1-3
                    
                                 Select 1 to see Available books
                    
                                 Select 2 to see checked out books
                    
                                      Select 3 to exit""");
        int choice = scanner.nextInt();


        boolean mainLoop = true;
        while (mainLoop) {
            if (choice == 1){
                for (int i = 0; i < allBooks.length; i++){
                    System.out.println(allBooks[i]);
                    mainLoop = false; }
                System.out.println("Select 2 to see checked out books or select 3 to exit");

            }


        }
    }
}
