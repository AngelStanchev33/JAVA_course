import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждаме търсената книга
        String targetBook = scanner.nextLine();

        // Брояч за проверени книги
        int checkedBooks = 0;

        // Четем първата книга
        String currentBook = scanner.nextLine();

        // Итерация докато не намерим търсената книга или книгите свършат
        while (!currentBook.equals("No More Books")) {
            // Увеличаваме брояча на проверените книги
            checkedBooks++;

            // Проверяваме дали текущата книга е търсената
            if (currentBook.equals(targetBook)) {
                System.out.printf("You checked %d books and found it.%n", checkedBooks);
                return; // Прекратяваме програмата
            }

            // Четем следващата книга
            currentBook = scanner.nextLine();
        }

        // Ако стигнем тук, значи не сме намерили книгата
        System.out.printf("The book you search is not here!%n");
        System.out.printf("You checked %d books.%n", checkedBooks);
    }
}
