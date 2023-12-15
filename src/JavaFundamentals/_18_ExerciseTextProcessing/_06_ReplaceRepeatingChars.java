package JavaFundamentals._18_ExerciseTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> clean = new ArrayList<>();
        String line = scanner.nextLine();
        char[] letters = line.toCharArray();
        for (char letter : letters) {
            clean.add(String.valueOf(letter));

        }

        for (int i = 0; i < clean.size()-1 ; i++) {
            String current = clean.get(i);
            String next = clean.get(i + 1);


            if (current.equals(next)) {
                clean.remove(i +1);
                i--;

            }
        }

        StringBuilder con = new StringBuilder();
        for (String s : clean) {
            con.append(s);
        }
        System.out.println(con.toString());
    }
}
