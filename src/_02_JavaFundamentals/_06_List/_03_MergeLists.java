import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstList = parseInputList(scanner.nextLine());
        List<String> secondList = parseInputList(scanner.nextLine());

        List<String> resultList = mergeLists(firstList, secondList);

        for (String item : resultList) {
            System.out.print(item + " ");
        }
    }

    public static List<String> parseInputList(String input) {
        String[] parts = input.split(" ");
        List<String> items = new ArrayList<>();
        for (String part : parts) {
            items.add(part);
        }
        return items;
    }

    public static List<String> mergeLists(List<String> firstList, List<String> secondList) {
        List<String> mergedList = new ArrayList<>();
        int minLength = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minLength; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }

        mergedList.addAll(firstList.subList(minLength, firstList.size()));
        mergedList.addAll(secondList.subList(minLength, secondList.size()));

        return mergedList;
    }
}
