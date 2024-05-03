package _03_JavaAdvanced._13_ExercisesGenerics._01_GenericBox;

public class Box<T extends Comparable<T>>  {

    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.data.getClass().getName(),
                this.data);
    }


}