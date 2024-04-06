package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailMap = new LinkedHashMap<>();

        String line = scanner.nextLine().trim();
        while (!"stop".equals(line)) {
            String email = scanner.nextLine().trim();

            emailMap.putIfAbsent(line, "");
            String value = emailMap.get(line);
            emailMap.put(line, value + email);

            line = scanner.nextLine().trim();
        }

        for (Map.Entry<String, String> entry : emailMap.entrySet()) {
            String email = entry.getValue();
            String part = email.substring(email.indexOf("@"));
            String domain = part.substring(part.indexOf(".") + 1);

            if (!domain.equals("us") && !domain.equals("uk") && !domain.equals("com")) {
                System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
