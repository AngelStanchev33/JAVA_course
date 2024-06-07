package _02_JavaFundamentals._12_MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _03_MemoryGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        List<String> num = new ArrayList<>(Arrays.asList(data));
        int moveCount = 0;
        int turns = 0;

        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            moveCount++;
            String[] numbers = line.split("\\s+");
            int indexOne = Integer.parseInt(numbers[0]);
            int indexTwo = Integer.parseInt(numbers[1]);

            for (int i = 0; i <num.size() ; i++) {

                if (indexOne < 0 || indexTwo < 0 || indexOne == indexTwo || indexOne >=num.size()||indexTwo >= num.size()){
                    String midNum = "-" + String.valueOf(moveCount) + "a";
                    int middleIndex = num.size()/2;
                    num.add(middleIndex,midNum);
                    num.add(middleIndex,midNum);
                    System.out.println("Invalid input! Adding additional elements to the board");
                    break;
                }

                else {
                    String numOne = num.get(indexOne);
                    String numTwo = num.get(indexTwo);

                    if (numOne.equals(numTwo)){
                        num.remove(numOne);
                        num.remove(numTwo);
                        turns++;
                        System.out.printf("Congrats! You have found matching elements - %s!%n",numOne);
                        break;
                    }
                    else{
                        System.out.println("Try again!");
                        break;
                    }
                }

            }
        }
        if (!num.isEmpty()){
            System.out.println("Sorry you lose :(");
            for (String s : num) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        else {
            System.out.printf("You have won in %d turns!%n",turns);
        }
    }
}
