import java.util.Objects;

public class Book {
    private final String title;
    private int yearPublication;
    private final Author author;

    public Book (String title, int yearPublication, Author author) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication (int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublication, author);
    }

    @Override
    public String toString() {
        return "Book: Title - " + title + ", author - " + author + ", year publication - " + yearPublication + '.';
    }
}
