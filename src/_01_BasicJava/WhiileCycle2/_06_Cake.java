import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;  // Общ брой парчета

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("STOP")) {  // Използваме equalsIgnoreCase за да проверим командата без значение на регистъра
            int numofPieces = Integer.parseInt(input);
            pieces -= numofPieces;  // Намаляваме броя на останалите парчета

            if (pieces <= 0) {  // Проверяваме дали тортата свършва
                break;
            }

            input = scanner.nextLine();
        }

        if (pieces > 0) {
            System.out.printf("%d pieces are left.", pieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }
    }
}
