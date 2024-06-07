package _03_JavaAdvanced._12_Generics._02_Generic_Array_Creator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArrayCreator {

    public static <T> T[] create(int length, T item) {
        return create(item.getClass(), length, item);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<?> clazz, int length, T item) {
        T[] arr = (T[])Array.newInstance(clazz, length);
        Arrays.fill(arr, item);
        return arr;
    }

}