package JavaFundamentals._25_FInalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> mirror = new ArrayList<>();
        List<String> pairs = new ArrayList<>();

        String line = scanner.nextLine().trim();
        String regex = "([@|#]{1})[A-Za-z]{3,}\\1{2}[A-Za-z]{3,}\\1{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            String match = matcher.group();
            String word = match.substring(1, match.length() - 1);
            String[] parts = word.split("[#|@]+");

            StringBuilder reverse = new StringBuilder();

            String wordOne = parts[0];
            String wordTwo = parts[1];

            reverse.append(wordTwo).reverse();
            String wordTwoReversed = reverse.toString();

            if (wordOne.equals(wordTwoReversed)) {
                mirror.add(word);
            }
            pairs.add(word);
        }

        if (pairs.isEmpty()) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", pairs.size());
        }
        if (mirror.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            int index = 0;
            StringBuilder sb = new StringBuilder();
            for (String word : mirror) {
                String[] printWord = word.split("[#|@]+");
                String togheter = "";
                String wordOne = printWord[0];
                String wordTwo = printWord[1];

                togheter = wordOne + " <=> " + wordTwo;
                sb.append(togheter);
                index++;
                if (index < mirror.size()) {
                    sb.append(", ");
                }
            }
            System.out.println(sb.toString());


        }

    }
}

