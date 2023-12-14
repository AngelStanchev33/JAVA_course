package JavaFundamentals._018_ExerciseTextProcessing;

import java.util.Scanner;

public class _03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] parts = line.split("\\\\");
        String fileName = parts[parts.length - 1];
        int indexOfDot = fileName.indexOf(".");
        fileName = fileName.substring(0,indexOfDot);

        parts = line.split("\\.");
        String extension = parts[parts.length - 1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s%n",extension);

    }
}
