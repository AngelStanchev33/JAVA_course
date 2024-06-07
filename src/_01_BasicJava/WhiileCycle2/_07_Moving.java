import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на размерите на свободното пространство
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;
        int boxes = 0;

        // Въвеждане на бройката кашони до получаване на команда "Done"
        String input = scanner.nextLine();
        while (!"Done".equalsIgnoreCase(input)){
            int numOfBoxes = Integer.parseInt(input);
            boxes += numOfBoxes;

            // Прекратяване на въвеждането, ако няма свободно място
            if (boxes >= freeSpace){
                break;
            }

            input = scanner.nextLine();
        }

        int result = Math.abs(boxes - freeSpace);

        // Извеждане на резултата
        if (boxes >= freeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", result);
        } else {
            System.out.printf("%d Cubic meters left.", result);
        }
    }
}