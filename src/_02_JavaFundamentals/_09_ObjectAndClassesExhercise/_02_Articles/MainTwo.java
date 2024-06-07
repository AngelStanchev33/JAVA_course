package _02_JavaFundamentals._09_ObjectAndClassesExhercise._02_Articles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles =  new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] articleData = scanner.nextLine().split(",");
            String initialArticle = articleData[0];
            String initialContent = articleData[1];
            String initialAuthor = articleData[2];
            Article article = new Article(initialArticle,initialContent,initialAuthor);

            articles.add(article);
        }

        String input = scanner.nextLine();

        switch (input){
            case "title":
                List<Article> sortedArticlesByTitle = articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .toList();

                for (Article article : sortedArticlesByTitle) {
                    System.out.println(article);
                }
                break;

            case "content":
                List<Article> sortedArticlesByContent =articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getContent))
                        .toList();
                for (Article article : sortedArticlesByContent) {
                    System.out.println(article);
                }
                break;

            case "author":
                List<Article> sortedArticlesByAuhtor =articles
                        .stream()
                        .sorted(Comparator.comparing(Article::getAuthor))
                        .toList();
                for (Article article : sortedArticlesByAuhtor) {
                    System.out.println(article);
                }
                break;
        }
    }
}
