public class Book {
    private String nameBook;
    private String nameAuthor;
    private int year;

    public Book (String nameAuthor, String nameBook, int year) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.year = year;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getNameBook(){
        return this.nameBook;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


