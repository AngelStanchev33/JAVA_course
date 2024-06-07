import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String currentURL = null;

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!"Home".equals(command)) {

            if ("back".equals(command)) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.push(currentURL);
                    currentURL = history.pop();
                    System.out.println(currentURL);
                }
            } else if ("forward".equals(command)) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    history.push(currentURL);
                    currentURL = forwardHistory.pop();
                    System.out.println(currentURL);
                }
            } else {
                if (currentURL != null) {
                    history.push(currentURL);
                    forwardHistory.clear();  // Изчистваме forward историята при ново посещение
                }
                currentURL = command;
                System.out.println(currentURL);
            }

            command = scanner.nextLine();
        }
    }
}
