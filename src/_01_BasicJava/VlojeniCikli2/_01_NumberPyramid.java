package _01_BasicJava.VlojeniCikli2;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        boolean isBigger = false;

        //формула за пирамида (двата цикала)

        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++){
                if (current > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
                
            }
            if (isBigger) {
                break;
            }
            System.out.println();
            
        }
    }
}
