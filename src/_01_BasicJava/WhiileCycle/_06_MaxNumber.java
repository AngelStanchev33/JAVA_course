
import java.util.Scanner;

public class _06_MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int maxNumber = 0;

        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if (number > maxNumber){
                maxNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}