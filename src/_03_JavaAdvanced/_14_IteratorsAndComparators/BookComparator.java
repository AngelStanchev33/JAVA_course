package _03_JavaAdvanced._14_IteratorsAndComparators;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book first, Book second) {
        return first.compareTo(second);
    }
}
