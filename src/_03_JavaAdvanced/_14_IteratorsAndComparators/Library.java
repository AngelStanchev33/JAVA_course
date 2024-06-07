package _03_JavaAdvanced._14_IteratorsAndComparators;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {

    private List<Book> books;

    public Library(Book... books) {
        this.books = List.of(books);
    }


    @NotNull
    @Override
    public Iterator<Book> iterator() {
        return new Iterator<Book>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < books.size();
            }
            @Override
            public Book next() {
                Book book = books.get(index);
                index++;
                return book;
            }
        };
    }
}
