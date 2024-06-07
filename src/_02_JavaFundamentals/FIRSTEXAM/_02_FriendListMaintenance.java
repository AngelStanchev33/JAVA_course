package _02_JavaFundamentals.FIRSTEXAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        String[] input = scanner.nextLine().split(", ");
        for (String name : input) {
            names.add(name);
        }

        int countBlackListed = 0;
        int countLostNames = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Report")) {
                break;
            }
            String[] tokens = line.split(" ");
            String command = tokens[0];

            switch (command){
                case "Blacklist":
                    String name = tokens[1];
                    if (names.contains(name)){
                        int index = names.indexOf(name);
                        names.remove(name);
                        names.add(index,"Blacklisted");
                        System.out.printf("%s was blacklisted.%n",name);
                        countBlackListed++;
                    }else {
                        System.out.printf("%s was not found.%n",name);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < names.size()){
                        String checkName = names.get(index);
                        if (checkName.equals("Blacklisted") || checkName.equals("Lost")){
                            break;
                        }else {
                            names.remove(checkName);
                            names.add(index,"Lost");
                            System.out.printf("%s was lost due to an error.%n",checkName);
                            countLostNames++;
                        }
                    }
                    break;
                case "Change":
                    int nameIndex = Integer.parseInt(tokens[1]);
                    String newName = tokens[2];
                    if (nameIndex >=0 && nameIndex < names.size()){
                        String currentName = names.get(nameIndex);
                        names.remove(currentName);
                        names.add(nameIndex,newName);
                        System.out.printf("%s changed his username to %s.%n",currentName,newName);
                    }
                    break;
            }
        }
        System.out.printf("Blacklisted names: %d%n",countBlackListed);
        System.out.printf("Lost names: %d%n",countLostNames);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
