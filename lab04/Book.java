public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public String toString(){
        return "autor: " + author + " tytuł: " + title + " rok produkcji: " + publicationYear;
    }
}
