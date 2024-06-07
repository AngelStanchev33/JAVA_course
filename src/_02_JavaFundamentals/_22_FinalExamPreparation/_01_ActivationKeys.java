package _02_JavaFundamentals._22_FinalExamPreparation;

import java.util.Scanner;

public class _01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while (!"Generate".equals(input)) {
            String[] parts = input.split(">>>");
            String commands = parts[0];

            switch (commands) {
                case "Contains":
                    String substring = parts[1];

                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!"
                        );
                    }
                    break;
                case "Flip":
                    String upperOrLower = parts[1];
                    int start = Integer.parseInt(parts[2]);
                    int end = Integer.parseInt(parts[3]);

                    if (upperOrLower.equals("Upper")) {
                        activationKey = activationKey.substring(0, start) + activationKey.substring(start, end).toUpperCase()
                                + activationKey.substring(end);

                    } else {
                        activationKey = activationKey.substring(0, start) + activationKey.substring(start, end).toLowerCase()
                                + activationKey.substring(end);
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int sliceStart = Integer.parseInt(parts[1]);
                    int sliceEnd = Integer.parseInt(parts[2]);

                    activationKey = activationKey.substring(0, sliceStart) + activationKey.substring(sliceEnd);
                    System.out.println(activationKey);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s%n",activationKey);
    }
}
