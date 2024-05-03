package _03_JavaAdvanced._13_ExercisesGenerics._02_GenericSwapMethodStrings;

import java.util.List;

public class Swap<T> {

    private T data;


    public Swap(T data) {
        this.data = data;
    }

    public static <T> List<T> swap(List<T> boxList, int indexElFirst, int indexElSecond) {
        T first = boxList.get(indexElFirst);
        T second = boxList.get(indexElSecond);

        boxList.set(indexElFirst, second);
        boxList.set(indexElSecond, first);

        return boxList;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.data.getClass().getName(),
                this.data);
    }
}
