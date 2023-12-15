package JavaFundamentals._18_ExerciseTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> chars = new ArrayList<>();
        String line = scanner.nextLine();
        char[] symbols = line.toCharArray();
        for (char symbol : symbols) {
            chars.add(symbol);
        }

        int strength = 0;

        for (int i = 0; i < chars.size(); i++) {
            char current = chars.get(i);
            int index = i;

            if (current == '>') {
                strength += (int) chars.get(i + 1) - '0';

                for (int j = index + 1; j < chars.size(); j++) {
                    char symbol = chars.get(j);
                    if (symbol != '>') {
                        chars.remove(j);
                        strength--;
                        j--;
                        i = j;

                        if (strength == 0) {
                            break;
                        }
                    } else {
                        strength += (int) chars.get(j + 1) - '0';

                    }
                }
            }
        }

        StringBuilder con = new StringBuilder();
        for (Character aChar : chars) {
            con.append(aChar);
        }
        System.out.println(con.toString());
    }
}
