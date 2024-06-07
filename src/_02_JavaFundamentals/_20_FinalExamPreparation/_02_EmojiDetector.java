package _02_JavaFundamentals._20_FinalExamPreparation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> emojis = new ArrayList<>();

        String line = scanner.nextLine();

        String regex = "(::|\\*\\*)([A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String emoji = matcher.group();
            emojis.add(emoji);
        }

        BigInteger coolness = getCoolness(line);
        List<String> coolEmojis = getCoolEmojis(emojis, coolness);

        System.out.printf("Cool threshold: %d%n", coolness);
        System.out.printf("%d emojis found in the text.",emojis.size());
        System.out.println(" The cool ones are:");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }


    }

    private static List<String> getCoolEmojis(List<String> emojis, BigInteger coolness) {
        List<String> coolEmojis = new ArrayList<>();

        for (String emoji : emojis) {
            BigInteger asiValue = BigInteger.valueOf(0);
            for (char asi : emoji.toCharArray()) {
                if (Character.isLetter(asi)) {
                    BigInteger asiVal = BigInteger.valueOf(asi);

                    asiValue = asiValue.add(asiVal);
                }
            }
            int comparisonResult = asiValue.compareTo(coolness);
            if (comparisonResult >= 0) {
                coolEmojis.add(emoji);
            }
        }
        return coolEmojis;
    }

    private static BigInteger getCoolness(String line) {
        BigInteger coolness = BigInteger.valueOf(1);

        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            int match = Integer.parseInt(matcher.group());
            coolness = coolness.multiply(BigInteger.valueOf(match));

        }
        return coolness;
    }
}


