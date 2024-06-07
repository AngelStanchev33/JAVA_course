package _03_JavaAdvanced._14_IteratorsAndComparators;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = List.of(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        this.authors = List.of(authors);
    }

    @Override
    public int compareTo(@NotNull Book other) {
        int result = this.title.compareTo(other.title);

        if (result == 0){
            result = Integer.compare(this.year,other.year);
        }

        return result;
    }
}
