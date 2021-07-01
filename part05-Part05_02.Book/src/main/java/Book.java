public class Book {
    private String bookAuthor;
    private String bookTitle;
    private int bookPagesNumber;

    public Book (String initialBookAuthor, String initialBookTitle, int initialBookPagesNumber) {
        this.bookAuthor = initialBookAuthor;
        this. bookTitle = initialBookTitle;
        this.bookPagesNumber = initialBookPagesNumber;
    }

    public String getAuthor () {
        return this.bookAuthor;
    }

    public String getName () {
        return this.bookTitle;
    }

    public int getPages() {
        return this.bookPagesNumber;
    }

    @Override
    public String toString () {
        return bookAuthor + ", " + bookTitle + ", " + bookPagesNumber + " pages";
    }
}
