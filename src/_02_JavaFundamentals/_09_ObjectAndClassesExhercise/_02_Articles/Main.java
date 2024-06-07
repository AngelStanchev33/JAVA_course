package _02_JavaFundamentals._09_ObjectAndClassesExhercise._02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(",");
        String initialArticle = articleData[0];
        String initialContent = articleData[1];
        String initialAuthor = articleData[2];
        Article article = new Article(initialArticle,initialContent,initialAuthor);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(":");
            String command = tokens[0];
            String data = tokens[1];

            switch (command){
                case "Edit":
                    article.edit(data);
                    break;
                case "ChangeAuthor":
                    article.change(data);
                    break;
                case "Rename":
                    article.rename(data);
                    break;
            }
        }

        System.out.println(article);
    }
}
