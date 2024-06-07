package _02_JavaFundamentals._01_Array;

import java.util.Scanner;

public class _01_DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] dayOfWeek ={
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if (dayNumber >= 1 && dayNumber <= 7){
            System.out.println(dayOfWeek[dayNumber-1]);
        }
        else {
            System.out.println("Invalid Day!");
        }

    }

}
