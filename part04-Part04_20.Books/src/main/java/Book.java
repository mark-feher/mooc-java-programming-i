public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book (String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear () {
        return this.publicationYear;
    }

    public int getNumberofPages () {
       return this.pages;
    }

    public String getBookTitle () {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.getPublicationYear();
    }
}
