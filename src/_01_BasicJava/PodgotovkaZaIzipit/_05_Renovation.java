package _01_BasicJava.PodgotovkaZaIzipit;

import java.util.Scanner;

public class _05_Renovation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double wallHeight = Integer.parseInt(scanner.nextLine());
        double wallWidth = Integer.parseInt(scanner.nextLine());
        double notPainted = Integer.parseInt(scanner.nextLine());

        double wallsToBePainted = wallHeight * wallWidth * 4;
        wallsToBePainted -= (wallsToBePainted * notPainted / 100);

        String command = scanner.nextLine();
        while (wallsToBePainted > 0) {
            if ("Tired!".equals(command)) {
                System.out.printf("%.0f quadratic m left.",Math.ceil(wallsToBePainted));
                return;
            }

            int paint = Integer.parseInt(command);
            wallsToBePainted -= paint;

            if (wallsToBePainted < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(Math.ceil(wallsToBePainted)));
                break;
            }

            command = scanner.nextLine();
        }

        if (wallsToBePainted >= 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
            return;
        }
    }
}
