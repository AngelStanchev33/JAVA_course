package _02_JavaFundamentals._11_MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingLIst = new ArrayList<>(Arrays.asList(scanner.nextLine().split("!")))
                .stream()
                .collect(Collectors.toList());


        while (true){
            String line = scanner.nextLine();
            if (line.equals("Go Shopping!")){
                break;
            }

            String[] tokes = line.split("\\s+");
            String command = tokes[0];
            String item  = tokes[1];

            switch (command){

                case "Urgent":
                    if (shoppingLIst.contains(item)){
                        break;
                    }
                    else {
                        shoppingLIst.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    shoppingLIst.remove(item);
                    break;
                case "Correct":
                    String newItem = tokes[2];
                    if (shoppingLIst.contains(item)){
                        int index = shoppingLIst.indexOf(item);
                        shoppingLIst.set(index,newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingLIst.contains(item)){
                        shoppingLIst.remove(item);
                        shoppingLIst.add(item);
                    }
                    break;
            }

        }
            System.out.println(String.join(
                    ", ",
                    shoppingLIst.stream().map(String::valueOf).collect(Collectors.toList())
            ));
    }
}

