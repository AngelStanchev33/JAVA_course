package _03_JavaAdvanced._15_ExercisesIteratorsAndComparators._01_ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        ListyIterator listyIterator = new ListyIterator();

        while (!"END".equals(line)){
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "Create":
                    String[] el = Arrays.copyOfRange(tokens, 1, tokens.length);

                    //String[] elements = new String[tokens.length - 1];
                    listyIterator = new ListyIterator(el);
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.forEach(e -> System.out.print(e + " "));
                    System.out.println();
                    break;

            }
            line = scanner.nextLine();
        }
    }
}
