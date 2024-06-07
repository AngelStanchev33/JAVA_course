import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split("\\|");
        List<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] temp = input[i].split("\\s+");
            for (String s : temp) {
                if (!"".equals(s.trim())) {
                    result.add(s);
                }
            }
        }
        System.out.println(String.join(" ", result));
    }
}
