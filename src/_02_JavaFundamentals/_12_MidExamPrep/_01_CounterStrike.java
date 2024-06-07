import java.util.Scanner;

public class _01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int wonBattles = 0;
        int energy = initialEnergy;
        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                energy -= distance;
                wonBattles++;

                if (wonBattles % 3 == 0) {
                    energy += wonBattles;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
    }
}