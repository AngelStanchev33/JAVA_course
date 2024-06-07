package _03_JavaAdvanced._13_ExercisesGenerics._04_CustomList;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomLIst<T extends Comparable<T>>implements Iterable<T>  {

    private List<T> data;

    public void Add(T element) {
        data.add(element);
    }

    public T remove(int element) {
        checkIndex(element);

        data.remove(element);

        return data.remove(element);
    }

    public boolean contains(T element) {
        return data.contains(element);
    }

    public List<T> swap(List<T> list, int eLOne, int elTwo) {
        checkIndex(eLOne);
        checkIndex(elTwo);

        T elementOne = data.get(eLOne);
        T elementTwo = data.get(elTwo);

        data.set(eLOne, elementTwo);
        data.set(elTwo, elementOne);

        return list;
    }

    public static <T extends Comparable<T>> int greaterNumbersCount(List<T> list, T element) {
        int count = 0;

        for (T current : list) {
            if (current.compareTo(element) > 0) {
                count++;
            }

        }
        return count;
    }

    public T getMax() {
        checkEmpty();
        return Collections.max(data);
    }

    public T getMin() {
        checkEmpty();
        return Collections.min(data);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.data.size()) {
            throw new IndexOutOfBoundsException(
                    String.format("Index %d is out of bounds for size %d", index, this.data.size()));
        }
    }

    private void checkEmpty() {
        if (this.data.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < data.size();
            }

            @Override
            public T next() {
                return data.get(index++);
            }
        };
    }
    //Методът hasNext() проверява дали има следващ елемент в списъка, като сравнява текущия индекс index с размера на списъка.
    // Връща true, ако index е по-малък от размера на списъка, в противен случай връща false.
    //Методът next() връща следващия елемент от списъка и увеличава индекса index, за да се приготви за връщане
    // на следващия елемент при следващото извикване на next().
    //Така този итератор позволява последователно обхождане на елементите във вашата колекция data. Когато се използва,
    // той преминава през всеки елемент от началото към края на списъка, връщайки всеки от тях по поред.


}
