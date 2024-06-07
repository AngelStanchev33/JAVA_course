package _02_JavaFundamentals._05_MethodsExercise;

import java.util.Scanner;

public class _04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passWord = scanner.nextLine().trim();

        passWordIsValidLenght(passWord);
        passWordIsValidLettersOrDigits(passWord);
        passWordisValidTwoDigits(passWord);

    if (passWordIsValidLenght(passWord) && passWordIsValidLettersOrDigits(passWord) && passWordisValidTwoDigits(passWord)){
        System.out.println("Password is valid");
    }
    if (!passWordIsValidLenght(passWord)) {
        System.out.println("Password must be between 6 and 10 characters");
    }
    if (!passWordIsValidLettersOrDigits(passWord)){
        System.out.println("Password must consist only of letters and digits");
    }
    if (!passWordisValidTwoDigits(passWord)){
        System.out.println("Password must have at least 2 digits");
    }


    }

    private static boolean passWordisValidTwoDigits(String passWord) {

        int digitCount =0;


        for (int i = 0; i <passWord.length() ; i++) {
            char c = passWord.charAt(i);
            if (Character.isDigit(c)){
                digitCount ++;
                if (digitCount > 2){
                    return true;
                }
            }
        }
    return false;}

    private static boolean passWordIsValidLettersOrDigits(String passWord) {

        for (int i = 0; i < passWord.length(); i++) {
            char c = passWord.charAt(i);
            if (!Character.isLetter(c) && !Character.isDigit(c)){
                return false;
            }
        }
    return true;}

    private static boolean passWordIsValidLenght(String passWord) {

        int passWordLenght = passWord.length();

        if(passWordLenght < 6 || passWordLenght >10 ){
            return false;
        }
    return true;}


}
