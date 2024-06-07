package _03_JavaAdvanced._15_ExercisesIteratorsAndComparators._01_ListyIterator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

    private List<String> listyList;
    private  int currentIndex;

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public ListyIterator(String...strings) {
        this.listyList = new ArrayList<>(Arrays.asList(strings));;
        this.currentIndex = 0;
    }


    public boolean hasNext() {
        return this.currentIndex < this.listyList.size() - 1;
    }

    public void print() {
        if (this.listyList.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.listyList.get(this.currentIndex));
    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

             private int index = 0;
            @Override
            public boolean hasNext() {
                return index < listyList.size();
            }

            @Override
            public String next() {
                return listyList.get(index++);
            }
        };
    }
}
