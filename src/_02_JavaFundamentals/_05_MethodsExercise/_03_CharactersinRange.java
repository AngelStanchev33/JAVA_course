package _02_JavaFundamentals._05_MethodsExercise;

import java.util.Scanner;

public class _03_CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one  = scanner.nextLine().charAt(0);
        char two  = scanner.nextLine().charAt(0);

        if (one < two){
            printSymbolsInRange(one,two);
        }
        else {
            printSymbolsInRange(two,one
            );

        }
    }
    private static void printSymbolsInRange(char one, char two) {
        for (char i = ++one; i <two ; i++) {
            System.out.printf("%c ",i );
            
        }
    }
}
