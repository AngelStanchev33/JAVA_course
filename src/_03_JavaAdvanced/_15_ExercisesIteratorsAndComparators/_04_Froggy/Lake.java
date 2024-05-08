package _03_JavaAdvanced._15_ExercisesIteratorsAndComparators._04_Froggy;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private int[] numbers;

    public Lake(int... numbers) {
        this.numbers = numbers;
    }

    public static int size (Lake lake){
        return lake.numbers.length;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new FrogJumps();
    }
    private class FrogJumps implements Iterator<Integer> {

        int index = 0;
        private List<Integer> evenList = new ArrayList<>();
        private List<Integer> oddList = new ArrayList<>();

        public FrogJumps() {

            for (int number : numbers) {
                if (number % 2 == 0){
                    evenList.add(number);
                }else {
                    oddList.add(number);
                }
            }
            oddList.addAll(evenList);

        }
        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            return oddList.get(index++);

        }
    }
}
