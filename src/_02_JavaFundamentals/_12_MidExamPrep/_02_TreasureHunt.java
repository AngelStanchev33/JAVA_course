package _02_JavaFundamentals._12_MidExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class _02_TreasureHunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> loot = new ArrayList<>(Arrays.asList(scanner.nextLine().trim().split("\\|")))
                .stream()
                .collect(Collectors.toList());

        while (true){
            String line = scanner.nextLine();
            if ("Yohoho!".equals(line)){
                break;
            }
            String[] lines = line.trim().split("\\s+");
            String command = lines[0];

            switch (command){
                case "Loot":
                    for (int i = 1; i <=lines.length -1 ; i++) {
                        if (!loot.contains(lines[i])){
                            loot.add(0,lines[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(lines[1]);
                    if (index >= 0 && index < loot.size()){
                        String removedItem = loot.remove(index);
                        loot.add(removedItem);
                    }
                    break;
                case "Steal":
                    int lastCount = Integer.parseInt(lines[1]);
                    int result = loot.size() - lastCount;
                    List<String> removedItems = new ArrayList<>();
                    if (result >= 0){
                        for (int i = result; i <loot.size() ; i++) {
                            String item = loot.remove(i--);
                            removedItems.add(item);
                        }
                    }
                    else {
                        for (int i = 0; i < loot.size(); i++) {
                            String item = loot.remove(i--);
                            removedItems.add(item);
                        }
                    }

                    String joinedItems = String.join(", ",removedItems);
                    System.out.println(joinedItems);
                    break;
            }
        }

        if (!loot.isEmpty()){
            int treasure = 0;
            for (String s : loot) {
                int length = s.length();
                treasure+=length;
            }
            double pirateScore = (double) treasure / loot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",pirateScore);
        }

        else {
            System.out.println("Failed treasure hunt.");
        }

    }
}


