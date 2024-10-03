public class neighborhoodLibrary {

    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    checkOut();

    checkIn();


    @Override
    public String toString() {
        return "neighborhoodLibrary{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }

    public static void main(String[] args) {



    }




}
