package _03_JavaAdvanced._13_ExercisesGenerics._03_GenericCountMethodStrings;

import java.util.List;

public class CountMethod<T> {

    public static <T extends Comparable<T>> int number(List<T> list, T value) {
        int count = 0;
        for (T element : list) {
            if (element.compareTo(value) > 0) {
                count++;
            }
        }
        return count;
    }
}

