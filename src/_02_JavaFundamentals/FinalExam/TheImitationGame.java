package _02_JavaFundamentals.FinalExam;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String line = scanner.nextLine();
        while (!"Decode".equals(line)) {
            String[] split = line.split("\\|");
            String command = split[0];

            switch (command) {
                case "Move":
                    int numOfLet = Integer.parseInt(split[1]);
                    if (numOfLet >= 0 && numOfLet <= input.length()) {
                        String firstLet = input.substring(0, numOfLet);
                        String left = input.substring(numOfLet);
                        input = left + firstLet;
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(split[1]);
                    String value = split[2];
                    if (index >= 0 && index <= input.length()) {
                        String beforeIndex = input.substring(0, index);
                        input = beforeIndex + value + input.substring(index);
                    }
                    break;
                case "ChangeAll":
                    String sub = split[1];
                    String rep = split[2];
                    if (input.contains(sub)) {
                        input = input.replaceAll(sub, rep);
                    }
                    break;
            }


            line = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", input);

    }


}
