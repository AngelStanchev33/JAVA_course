package _02_JavaFundamentals._15_MidExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = new ArrayList<>();
        String[] data = scanner.nextLine().trim().split("\\s+");
        for (String datum : data) {
            int target = Integer.parseInt(datum);
            targets.add(target);
        }
        int targetShot =0;

        while (true) {
            String command = scanner.nextLine().trim();
            if (command.equals("End")) {
                break;
            }
            int shootIndex = Integer.parseInt(command);
            boolean indexExist = true;
            if (shootIndex < 0 || shootIndex > targets.size() - 1) {
                indexExist = false;
            }
            if (indexExist) {
                int damage = targets.get(shootIndex);
                targets.set(shootIndex, -1);

                for (int i = 0; i < targets.size(); i++) {
                    int currentTarget = targets.get(i);
                    if (currentTarget > damage) {
                        currentTarget -= damage;
                    } else if (currentTarget <= 0) {
                        targets.set(i, -1);
                    } else {
                        currentTarget += damage;
                    }
                    targets.set(i, currentTarget);
                }
            }
        }
        List<String> targetInString = new ArrayList<>();
        for (Integer target : targets) {

            if (target == -1){
                targetShot++;
            }
            String current = String.valueOf(target);
            targetInString.add(current);
        }

        String joined = String.join(" ",targetInString);
        System.out.printf("Shot targets: %d -> %s",targetShot,joined);
    }
}
