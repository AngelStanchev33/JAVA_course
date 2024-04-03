package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vipClub = new TreeSet<>();
        Set<String> normalClub = new TreeSet<>();

        String input = scanner.nextLine().trim();

        while (!"PARTY".equals(input)) {
            char firstChar = input.charAt(0);

            if (Character.isDigit(firstChar)) {
                vipClub.add(input);
            } else {
                normalClub.add(input);
            }
            input = scanner.nextLine().trim();
        }

        input = scanner.nextLine();

        while (!"END".equals(input)) {
            vipClub.remove(input);
            normalClub.remove(input);

            input = scanner.nextLine().trim();
        }

        System.out.println(vipClub.size() + normalClub.size());

        for (String vip : vipClub) {
            System.out.println(vip);
        }
        for (String normal : normalClub) {
            System.out.println(normal);
        }
    }
}
