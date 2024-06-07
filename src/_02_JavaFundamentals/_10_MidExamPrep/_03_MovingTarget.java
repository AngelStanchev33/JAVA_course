import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+"))
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }

            String[] commandArgs = line.split(" ");
            String command = commandArgs[0];
            int index = Integer.parseInt(commandArgs[1]);

            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets, index))
                        targets.set(index, targets.get(index) - power);
                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets, index)) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid Placement");
                        break;
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandArgs[2]);
                    int leftIndex = Math.max(index - radius, 0);
                    int rightIndex = Math.min(index + radius, targets.size() - 1);
                    if (isInside(targets, leftIndex) && isInside(targets, rightIndex)) {
                        int count = rightIndex - leftIndex + 1;
                        for (int i = 0; i < count; i++) {
                            targets.remove(leftIndex);
                        }
                    } else {
                        System.out.println("Strike Missed");
                    }
                    break;
            }
        }
        System.out.println(String.join(
                "|",
                targets.stream().map(String::valueOf).collect(Collectors.toList())));
    }

    public static boolean isInside(List<Integer> list, int index) {
        return index >= 0 && index < list.size();
    }
}
