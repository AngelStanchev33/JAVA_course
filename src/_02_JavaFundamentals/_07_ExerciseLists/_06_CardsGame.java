import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<Integer> playerOne = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            playerOne.add(current);
        }

        String[] partsTwo = scanner.nextLine().split(" ");
        List<Integer> playerTwo = new ArrayList<>();
        for (String part : partsTwo) {
            int current = Integer.parseInt(part);
            playerTwo.add(current);
        }

        while (!playerOne.isEmpty() && !playerTwo.isEmpty()) {
            int playOneCard = playerOne.get(0);
            int playerTwoCard = playerTwo.get(0);

            if (playOneCard > playerTwoCard) {
                playerOne.add(playOneCard);
                playerOne.add(playerTwoCard);
            } else if (playOneCard < playerTwoCard) {
                playerTwo.add(playerTwoCard);
                playerTwo.add(playOneCard);
            }

            playerOne.remove(0);
            playerTwo.remove(0);
        }

        int sumOne = 0;
        for (Integer integer : playerOne) {
            sumOne += integer;
        }

        int sumTwo = 0;
        for (Integer integer : playerTwo) {
            sumTwo += integer;
        }

        if (sumOne > sumTwo) {
            System.out.printf("First player wins! Sum: %d%n", sumOne);
        } else {
            System.out.printf("Second player wins! Sum: %d%n", sumTwo);
        }
    }
}
