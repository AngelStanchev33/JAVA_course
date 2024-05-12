package _03_JavaAdvanced._17_ExamPrep;

import java.util.*;
import java.util.stream.Stream;

public class _01_FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Character> vowels = parseInputAsStack(scanner.nextLine(), true);
        Deque<Character> consonants = parseInputAsStack(scanner.nextLine(), false);

        List<String> wordToPrint = new ArrayList<>();

        String[] wordToCheck = {"pear", "flour", "pork", "olive"};
        String[] wordsToCreate = {"****", "*****", "****", "*****"};

        while (!consonants.isEmpty()) {
            Character firstVowel = vowels.getFirst();
            Character firstConsonants = consonants.getFirst();

            for (int i = 0; i < wordToCheck.length; i++) {
                String word = wordToCheck[i];
                for (char c : word.toCharArray()) {
                    int currentIndex = word.indexOf(c);
                    if (firstVowel.equals(c)) {
                        wordsToCreate[i] = wordsToCreate[i].substring(0, currentIndex) + firstVowel +
                                wordsToCreate[i].substring(currentIndex + 1);
                    } else if (firstConsonants.equals(c)) {
                        wordsToCreate[i] = wordsToCreate[i].substring(0, currentIndex) + firstConsonants +
                                wordsToCreate[i].substring(currentIndex + 1);
                    }
                }
            }
            consonants.removeFirst();
            vowels.addLast(firstVowel);
            vowels.removeFirst();
        }

        for (String s : wordsToCreate) {
            if (!s.contains("*")){
                wordToPrint.add(s);
            }
        }

        System.out.printf("Words found: %d%n",wordToPrint.size());
        for (String s : wordToPrint) {
            System.out.println(s);
        }
    }

    private static Deque<Character> parseInputAsStack(String s, boolean fromFront) {
        Deque<Character> stack = new ArrayDeque<>();
        Stream.of(s.split("\\s+"))
                .flatMap(token -> token.chars().mapToObj(ch -> (char) ch))
                .forEach(ch -> {
                    if (fromFront) {
                        stack.addLast(ch);
                    } else {
                        stack.addFirst(ch);
                    }
                });
        return stack;
    }
}


  
