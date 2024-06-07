package _03_JavaAdvanced._13_ExercisesGenerics;

import java.util.List;


public class Demo {
    public static <T extends Comparable<T>> int number(List<T> list, T value) { //extendvane metod;
        int count = 0;
        return count;
    }


    //В Java, методът compareTo() връща:

    //Негативно цяло число, ако left е по-малък от right.
    //Нула, ако left и right са равни.
    //Положително цяло число, ако left е по-голям от right.

    //условие ? израз_ако_условието_е_истинско : израз_ако_условието_е_лъжливо



}
