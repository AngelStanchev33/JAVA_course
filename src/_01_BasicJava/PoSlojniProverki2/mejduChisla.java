package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class mejduChisla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;

        if (b == 0 && (operator.equals("/") || operator.equals("%"))){
            System.out.printf("Cannot divide %d by zero",a);}


        switch (operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a -b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result =(double) a / b;
                break;
            case "%":
                result = a % b;
                break;

        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            String evenorOdd = "";
            if (result % 2 == 0) {
                evenorOdd = "even";
            } else {
                evenorOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f – %s", a, operator, b, result, evenorOdd);
        }
        else if (operator.equals("/")){
            System.out.printf("%d %s %d = %.2f",a,operator,b,result);
        }
        else if (operator.equals("%")){
            System.out.printf("%d %s %d = %.0f",a,operator,b,result);
        }

        }

    }

